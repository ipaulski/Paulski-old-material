// Asteroids.java file

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.util.*;
import java.net.*;
/*****************************************************
 * Primary class for the game inherits from Applet
 *****************************************************/
public class Asteroids extends Applet implements Runnable, KeyListener {

    //the main thread becomes the game loop
    Thread gameloop;
    AudioClip hitnoise;
    //use this as a double buffer
    BufferedImage backbuffer;

    //the main drawing object for the back buffer
    Graphics2D g2d;

    Ship ship = new Ship();

    //create the bullet array
    int BULLETS = 50;
    Bullet[] bullet = new Bullet[BULLETS];
    int currentBullet = 0;

    int lives = 3;
    int score;

    //toggle for drawing bounding boxes
    boolean showBounds = false;

    //create the asteroid array
    int ASTEROIDS = 20;
    Asteroid[] ast = new Asteroid[ASTEROIDS];

    int SASTEROIDS = 5;
    Asteroid[] Sast = new Asteroid[SASTEROIDS];

    //create the identity transform (0,0)
    AffineTransform identity = new AffineTransform();

    //create a random number generator
    Random rand = new Random();
    int angleShoot2 = 80;
    int angleShoot = 80;

    public URL getURL(String filename){
        URL url = null;
        try{
            url = this.getClass().getResource(filename);
        }
        catch (Exception e){}
        return url;
    }

    /*****************************************************
     * applet init event
     *****************************************************/
    public void init() {
        ship.setX(320);
        ship.setY(240);
        hitnoise = getAudioClip (getCodeBase() , "gun.au");
        hitnoise.play();
        hitnoise.stop();

        //set up the bullets
        for (int n = 0; n<BULLETS; n++) {
            bullet[n] = new Bullet();
        }

        //create the back buffer for smooth graphics
        backbuffer = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        g2d = backbuffer.createGraphics();

        //create the asteroids
        for (int n = 0; n<ASTEROIDS; n++) {
            ast[n] = new Asteroid();
            ast[n].setRotationVelocity(rand.nextInt(3)+1);
            ast[n].setX((double)rand.nextInt(600)+20);
            ast[n].setY((double)rand.nextInt(440)+20);
            ast[n].setMoveAngle(rand.nextInt(360));
            double ang = ast[n].getMoveAngle() - 90;
            ast[n].setVelX(calcAngleMoveX(ang));
            ast[n].setVelY(calcAngleMoveY(ang));
        }
        for (int n = 0; n<SASTEROIDS; n++) {
            Sast[n] = new Asteroid();
            Sast[n].setRotationVelocity(rand.nextInt(3)+1);
            Sast[n].setX((double)rand.nextInt(600)+20);
            Sast[n].setY((double)rand.nextInt(440)+20);
            Sast[n].setMoveAngle(rand.nextInt(360));
            double ang = Sast[n].getMoveAngle() - 90;
            Sast[n].setVelX(calcAngleMoveX(ang));
            Sast[n].setVelY(calcAngleMoveY(ang));
        }
        //start the user input listener
        addKeyListener(this);
    }

    /*****************************************************
     * drawShip called by applet update event
     *****************************************************/
    public void drawShip() {
        g2d.setTransform(identity);
        g2d.translate(ship.getX(), ship.getY());
        g2d.rotate(Math.toRadians(ship.getFaceAngle()));
        g2d.setColor(Color.GREEN);
        if(lives==2)g2d.setColor(Color.YELLOW);
        if(lives==1)g2d.setColor(Color.RED);
        if(lives<=0)g2d.setColor(Color.BLACK);
        g2d.fill(ship.getShape());
    }

    /*****************************************************
     * drawBullets called by applet update event
     *****************************************************/
    public void drawBullets() {

        //iterate through the array of bullets
        for (int n = 0; n < BULLETS; n++) {

            //is this bullet currently in use?
            if (bullet[n].isAlive()) {

                //draw the bullet
                g2d.setTransform(identity);
                g2d.translate(bullet[n].getX(), bullet[n].getY());
                g2d.setColor(Color.MAGENTA);
                g2d.draw(bullet[n].getShape());
            }
        }
    }

    /*****************************************************
     * applet update event to redraw the screen
     *****************************************************/
    public void update(Graphics g) {
        //start off transforms at identity
        g2d.setTransform(identity);

        //erase the background
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0, 0, getSize().width, getSize().height);

        g2d.setFont(new Font("TimesRoman",Font.PLAIN,20));
        g2d.setColor(Color.WHITE);
        g2d.drawString("Lives: "+lives+"     Score: "+score, 10, 20); 

        if(lives<=0){
            g2d.setFont(new Font("TimesRoman",Font.PLAIN,30));
            g2d.setColor(Color.RED);
            g2d.drawString("--END GAME--", 230, 230); 
            g2d.drawString("END SCORE: "+score, 230, 280); 
        }

        drawShip();
        drawBullets();
        drawAsteroids();
        if(lives<=2){
            drawSAsteroids();
        }
        //repaint the applet window
        paint(g);

    }

    /*****************************************************
     * drawAsteroids called by applet update event
     *****************************************************/
    public void drawAsteroids() {

        //iterate through the asteroids array
        for (int n = 0; n < ASTEROIDS; n++) {

            //is this asteroid being used?
            if (ast[n].isAlive()) {

                //draw the asteroid
                g2d.setTransform(identity);
                g2d.translate(ast[n].getX(), ast[n].getY());
                g2d.rotate(Math.toRadians(ast[n].getMoveAngle()));
                g2d.setColor(Color.DARK_GRAY);
                g2d.fill(ast[n].getShape());

            }
        }
    }

    public void drawSAsteroids() {

        //iterate through the asteroids array]
        if(score>= 600){
            for (int n = 0; n < SASTEROIDS; n++) {

                //is this asteroid being used?
                if (Sast[n].isAlive()) {

                    //draw the asteroid
                    g2d.setTransform(identity);
                    g2d.translate(Sast[n].getX(), ast[n].getY());
                    g2d.rotate(Math.toRadians(ast[n].getMoveAngle()));
                    g2d.setColor(Color.ORANGE);
                    g2d.fill(Sast[n].getShape());

                }
            }
        }
    }

    /*****************************************************
     * applet window repaint event--draw the back buffer
     *****************************************************/
    public void paint(Graphics g) {

        //draw the back buffer onto the applet window
        g.drawImage(backbuffer, 0, 0, this);

    }

    /*****************************************************
     * thread start event - start the game loop running
     *****************************************************/
    public void start() {

        //create the gameloop thread for real-time updates
        gameloop = new Thread(this);
        gameloop.start();
    }

    /*****************************************************
     * thread run event (game loop)
     *****************************************************/
    public void run() {

        //acquire the current thread
        Thread t = Thread.currentThread();

        //keep going as long as the thread is alive
        while (t == gameloop) {

            try {
                //update the game loop
                gameUpdate();

                //target framerate is 50 fps
                Thread.sleep(20);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    /*****************************************************
     * thread stop event
     *****************************************************/
    public void stop() {

        //kill the gameloop thread
        gameloop = null;
    }

    /*****************************************************
     * move and animate the objects in the game
     *****************************************************/
    private void gameUpdate() {
        //gameUpdate or updateGame is where everything moves. It is a loop controlled by run() method
        updateBullets(); 
        updateShip();
        updateAsteroids();
        updateSAsteroids();
        checkCollisions();
        ScheckCollisions();
    }

    /*****************************************************
     * Update the asteroids based on velocity
     *****************************************************/
    public void updateAsteroids() {

        //move and rotate the asteroids
        for (int n = 0; n < ASTEROIDS; n++) {

            //is this asteroid being used?
            if (ast[n].isAlive()) {

                //update the asteroid's X value
                ast[n].incX(ast[n].getVelX());

                //warp the asteroid at screen edges
                if (ast[n].getX() < 10)
                    ast[n].setVelX((ast[n].getVelX()*-1));
                if (ast[n].getX() > 640)
                    ast[n].setVelX((ast[n].getVelX()*-1));

                //update the asteroid's Y value
                ast[n].incY(ast[n].getVelY());

                //warp the asteroid at screen edges
                if ((ast[n].getY()) < 15)
                    ast[n].setVelY((ast[n].getVelY()*-1));
                if (ast[n].getY() > 480)
                    ast[n].setVelY((ast[n].getVelY()*-1));
                //update the asteroid's rotation
                ast[n].incMoveAngle(ast[n].getRotationVelocity());

                //keep the angle within 0-359 degrees
                if (ast[n].getMoveAngle() < 0)
                    ast[n].setMoveAngle(360 - ast[n].getRotationVelocity());
                else if (ast[n].getMoveAngle() > 359)
                    ast[n].setMoveAngle(ast[n].getRotationVelocity());
            }
        }
    }

    public void updateSAsteroids() {

        //move and rotate the asteroids
        for (int n = 0; n < SASTEROIDS; n++) {

            //is this asteroid being used?
            if (Sast[n].isAlive()) {

                //update the asteroid's X value
                Sast[n].incX(Sast[n].getVelX());

                //warp the asteroid at screen edges
                if (Sast[n].getX() < 10)
                    Sast[n].setVelX((Sast[n].getVelX()*-1));
                if (Sast[n].getX() > 640)
                    Sast[n].setVelX((Sast[n].getVelX()*-1));

                //update the asteroid's Y value
                Sast[n].incY(Sast[n].getVelY());

                //warp the asteroid at screen edges
                if ((Sast[n].getY()) < 15)
                    Sast[n].setVelY((Sast[n].getVelY()*-1));
                if (Sast[n].getY() > 480)
                    Sast[n].setVelY((Sast[n].getVelY()*-1));
                //update the asteroid's rotation
                Sast[n].incMoveAngle(Sast[n].getRotationVelocity());

                //keep the angle within 0-359 degrees
                if (Sast[n].getMoveAngle() < 0)
                    Sast[n].setMoveAngle(360 - Sast[n].getRotationVelocity());
                else if (Sast[n].getMoveAngle() > 359)
                    Sast[n].setMoveAngle(Sast[n].getRotationVelocity());
            }
        }
    }

    /*********************************************************
     * Update the ship position based on velocity
     **********************************************************/
    public void updateShip() {

        //update ships X position
        ship.incX(ship.getVelX());

        //wrap around left/right
        if(ship.getX() < -10)
        {
            ship.setX(450);
        }
        else if(ship.getX() > getSize().width + 1){
            ship.setX(0);
        }

        //update ship's Y pos
        ship.incY(ship.getVelY());

        //wrap around top/bottom
        if(ship.getY() < -10){
            ship.setY(640);
        }
        else if(ship.getY() > getSize().height + 10){
            ship.setY(0);
        }
    }

    public void updateBullets() {
        //move each of the bullets
        for (int n = 0; n < BULLETS; n++) {
            //is this bullet being used?
            if (bullet[n].isAlive()) {

                //update bullet's x position
                bullet[n].incX(bullet[n].getVelX());

                //bullet disappears at left/right edge
                if (bullet[n].getX() < 0 ||
                bullet[n].getX() > getSize().width)
                {
                    bullet[n].setAlive(false);
                }

                //update bullet's y position
                bullet[n].incY(bullet[n].getVelY());

                //bullet disappears at top/bottom edge
                if (bullet[n].getY() < 0 ||
                bullet[n].getY() > getSize().height)
                {
                    bullet[n].setAlive(false);
                }
            }
        }
    }

    /*****************************************************
     * Test asteroids collisions with ship or bullets
     *****************************************************/
    public void checkCollisions() {
        for (int m = 0; m<ASTEROIDS; m++) {
            //Step 2 here
            if (ast[m].isAlive()) {

                // check for collision with bullet
                for (int n = 0; n < BULLETS; n++) {
                    //is this bullet being used?
                    if (bullet[n].isAlive()&&ast[m].isAlive()) {

                        //perform the collision test
                        if (ast[m].getBounds().contains(
                            bullet[n].getX(), bullet[n].getY()))
                        {
                            hitnoise=getAudioClip(getCodeBase(),"bombs.wav");
                            try{
                                hitnoise.play();
                            }
                            catch
                            (Exception exc){} ;

                            bullet[n].setAlive(false);
                            ast[m].setAlive(false);
                            score+=100;
                            continue;
                        }
                    }
                }
                if (ast[m].isAlive() && ship.isAlive() && ast[m].getBounds().intersects(ship.getBounds())) {
                    ast[m].setAlive(false);
                    ship.setX(320);
                    ship.setY(240);
                    ship.setFaceAngle(0);
                    ship.setVelX(0);
                    ship.setVelY(0);
                    lives--;
                    continue;
                }  
                //for Bullet

            }   
        }

    }  

    public void ScheckCollisions() {
        for (int m = 0; m<SASTEROIDS; m++) {
            //Step 2 here
            if (Sast[m].isAlive()) {

                // check for collision with bullet
                for (int n = 0; n < BULLETS; n++) {
                    //is this bullet being used?
                    if (bullet[n].isAlive()&&Sast[m].isAlive()) {

                        //perform the collision test
                        if (Sast[m].getBounds().contains(
                            bullet[n].getX(), bullet[n].getY()))
                        {
                            hitnoise=getAudioClip(getCodeBase(),"bombs.wav");
                            bullet[n].setAlive(false);
                            Sast[m].setAlive(false);
                            score+=100;
                            continue;
                        }
                    }
                }
                if (Sast[m].isAlive() && ship.isAlive() && Sast[m].getBounds().intersects(ship.getBounds())) {
                    Sast[m].setAlive(false);
                    ship.setX(320);
                    ship.setY(240);
                    ship.setFaceAngle(0);
                    ship.setVelX(0);
                    ship.setVelY(0);
                    lives--;
                    continue;
                }  
                //for Bullet

            }   
        }

    }  

    /*****************************************************
     * key listener events
     *****************************************************/
    public void keyReleased(KeyEvent k) {
        int keyCode = k.getKeyCode();
    }

    public void keyTyped(KeyEvent k) { }

    public void keyPressed(KeyEvent k) {
        int keyCode = k.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_LEFT:
            //left arrow rotates ship left 5 degrees
            ship.incFaceAngle(-5);
            if(ship.getFaceAngle() < 0)ship.setFaceAngle(360-5);
            break;

            case KeyEvent.VK_RIGHT:
            //right arrow rotates ship right 5 degrees
            ship.incFaceAngle(5);
            if(ship.getFaceAngle() > 360)ship.setFaceAngle(5);
            break;

            case KeyEvent.VK_DOWN:
            //up arrow adds thrust to ship (1/10 normal speed)
            ship.setMoveAngle(ship.getFaceAngle() - 90);
            ship.incVelX(calcAngleMoveX(ship.getMoveAngle()) * 0.1);
            ship.incVelY(calcAngleMoveY(ship.getMoveAngle()) * 0.1);
            break;

            case KeyEvent.VK_UP:
            //up arrow adds thrust to ship (1/10 normal speed)
            ship.setMoveAngle(ship.getFaceAngle() + 90);
            ship.incVelX(calcAngleMoveX(ship.getMoveAngle()) * 0.1);
            ship.incVelY(calcAngleMoveY(ship.getMoveAngle()) * 0.1);
            break;

            case KeyEvent.VK_C:
            ship.setVelX(0);
            ship.setVelY(0);
            break;

            case KeyEvent.VK_S:
            //fire a bullet
            for (int i = 0 ; i<4; i++){
                currentBullet++;
                if (currentBullet > BULLETS - 1) currentBullet = 0;
                bullet[currentBullet].setAlive(true);

                //             case KeyEvent.VK_Z:
                //             //custom
                //             newBullet++;
                //             break;
                //point bullet in same direction ship is facing
                bullet[currentBullet].setX(ship.getX());
                bullet[currentBullet].setY(ship.getY());
                bullet[currentBullet].setMoveAngle(ship.getFaceAngle()+angleShoot);

                //fire bullet at angle of the ship
                double angle = bullet[currentBullet].getMoveAngle();
                double svx = ship.getVelX();
                double svy = ship.getVelY();
                bullet[currentBullet].setVelX(svx + calcAngleMoveX(angle) * 2);
                bullet[currentBullet].setVelY(svy + calcAngleMoveY(angle) * 2);
                angleShoot += 10;
            }
            break;

            case KeyEvent.VK_X:
            //fire a bullet
            for (int i = 0 ; i<4; i++){
                currentBullet++;
                if (currentBullet > BULLETS - 1) currentBullet = 0;
                hitnoise=getAudioClip(getCodeBase(),"Grenade-SoundBible.com-2124844747.wav");
                bullet[currentBullet].setAlive(true);

                //             case KeyEvent.VK_Z:
                //             //custom
                //             newBullet++;
                //             break;
                //point bullet in same direction ship is facing
                bullet[currentBullet].setX(ship.getX());
                bullet[currentBullet].setY(ship.getY());
                bullet[currentBullet].setMoveAngle(ship.getFaceAngle()+angleShoot2);

                //fire bullet at angle of the ship
                double angle = bullet[currentBullet].getMoveAngle();
                double svx = ship.getVelX();
                double svy = ship.getVelY();
                bullet[currentBullet].setVelX(svx + calcAngleMoveX(angle) * 2);
                bullet[currentBullet].setVelY(svy + calcAngleMoveY(angle) * 2);
                angleShoot2 += 10;
            }
            break;

            case KeyEvent.VK_SPACE:
            currentBullet++;
            if (currentBullet > BULLETS - 1) currentBullet = 0;
            bullet[currentBullet].setAlive(true);

            //             case KeyEvent.VK_Z:
            //             //custom
            //             newBullet++;
            //             break;
            //point bullet in same direction ship is facing
            bullet[currentBullet].setX(ship.getX());
            bullet[currentBullet].setY(ship.getY());
            bullet[currentBullet].setMoveAngle(ship.getFaceAngle()+angleShoot);

            //fire bullet at angle of the ship
            double angle = bullet[currentBullet].getMoveAngle();
            double svx = ship.getVelX();
            double svy = ship.getVelY();
            bullet[currentBullet].setVelX(svx + calcAngleMoveX(angle) * 2);
            bullet[currentBullet].setVelY(svy + calcAngleMoveY(angle) * 2);

            break;

        } 
        angleShoot2 = 80;
    }

    /*****************************************************
     * calculate X movement value based on direction angle
     *****************************************************/
    public double calcAngleMoveX(double angle) {
        return (double) (Math.cos(angle * Math.PI / 180));
    }

    /*****************************************************
     * calculate Y movement value based on direction angle
     *****************************************************/
    public double calcAngleMoveY(double angle) {
        return (double) (Math.sin(angle * Math.PI / 180));
    }

}