import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.util.*;
import java.awt.Font;
import java.io.*;
import javax.sound.sampled.*;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.net.*;
/*****************************************************
 * Primary class for the game inherits from Applet
 *****************************************************/
public class MeteorShower extends Applet implements Runnable, KeyListener {

    //the main thread becomes the game loop
    Thread gameloop;

    //use this as a double buffer
    BufferedImage backbuffer;

    //the main drawing object for the back buffer
    Graphics2D g2d;

    //toggle for drawing bounding boxes
    boolean showBounds = false;

    //create the asteroid array
    int ASTEROIDS = 15;
    Asteroid[] ast = new Asteroid[ASTEROIDS];
    int HealthASTEROIDS = 1;
    HealthAsteroid[] ast1 = new HealthAsteroid[HealthASTEROIDS];
    int DeathASTEROIDS = 1;
    DeathAsteroid[] ast2 = new DeathAsteroid[DeathASTEROIDS];

    //create the identity transform (0,0)
    AffineTransform identity = new AffineTransform();

    //create a random number generator
    Random rand = new Random();

    Ship ship = new Ship();
    int BULLETS = 20;
    Bullet[] bullet = new Bullet[BULLETS];
    BigBullet[] bullet2 = new BigBullet[BULLETS];
    int currentBullet = 0;

    int LIVES = 3;
    int SCORE = 0;
    int HEALTH = 100;
    int BBHealth = (HEALTH*3);
    String health = "%";

    AudioClip Theme;
    Image background;

    int LEVEL = 1;
    int ROIDS = ASTEROIDS;
    String userName = "";

    boolean detonate = false;
    public URL getURL(String filename) {
        URL url = null;
        try {
            url = this.getClass().getResource(filename);
        }
        catch (Exception e) {}
        return url;
    }

    /*****************************************************
     * applet init event
     *****************************************************/
    public void init() {
        //create the back buffer for smooth graphics
        Toolkit tk = Toolkit.getDefaultToolkit();

        backbuffer = new BufferedImage(2000, 2000,
            BufferedImage.TYPE_INT_RGB);
        g2d = backbuffer.createGraphics();
        if (LEVEL >=5){
            background = tk.getImage(getURL("Background.png"));
        }
        else {
            background = tk.getImage(getURL("Background.gif"));
        }

        String start = "";
        if (LEVEL == 1){start = "START GAME";
            JFrame frame = new JFrame("InputDialog Example #1");
            userName= JOptionPane.showInputDialog(frame, "Username: ");
        }
        else {
            for (int i = 1; i<=LEVEL; i++){start = "Start Level " + LEVEL;}
        }
        Object[] possibleValues = { start, "Directions"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Meteor Shower", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        if (selectedValue == start){}
        else {JOptionPane.showMessageDialog(null, "Stay alive while making sure to protect your base. Don't get hit by the asteroids!!! \n Press 'A' for horizontal Big Bullets \n Press Space for vertical Small Bullets \n Don't let asteroids hit your base!! \n Don't let your health bar fall to 0!! \n Hit the Shooting Star to gain health. \n Hit the Death asteroid to kill off half the other asteroids!! \n Survive until all asteroids are gone!!");}

        if (LEVEL >=5){
            Theme = getAudioClip (getCodeBase() , "StarWars.wav");
        }
        else{
            Theme = getAudioClip (getCodeBase() , "Dont Stop Me Now [8 Bit Tribute to Queen] - 8 Bit Universe.wav");
        }

        ship.setX(500);
        for (int n = 0; n<BULLETS; n++){
            bullet[n] = new Bullet();
            bullet2[n] = new BigBullet();
        }
        ship.setY(620);
        //create the asteroids
        for (int n = 0; n<ASTEROIDS; n++) {
            ast[n] = new Asteroid();
            ast[n].setX((double)rand.nextInt(1000)+20);
            ast[n].setY((double)rand.nextInt(400)+20);
            ast[n].setMoveAngle(rand.nextInt(360));
            double ang = ast[n].getMoveAngle() - 90;
            if (LEVEL>=2){
                ast[n].setVelX(calcAngleMoveX(ang)*((LEVEL)*1.1));
                ast[n].setVelY(calcAngleMoveY(ang)*((LEVEL)*1.1));
            }
            else{
                ast[n].setVelX(calcAngleMoveX(ang));
                ast[n].setVelY(calcAngleMoveY(ang));
            }
        }
        //create Shooting Star (health asteroid)
        for (int n = 0; n<HealthASTEROIDS; n++){
            ast1[n] = new HealthAsteroid();
            ast1[n].setX((double)rand.nextInt(1000)+20);
            ast1[n].setY((double)rand.nextInt(400)+20);
            ast1[n].setMoveAngle(rand.nextInt(360));
            double ang = ast1[n].getMoveAngle() -90;
            ast1[n].setVelX(calcAngleMoveX(ang)*20);
            ast1[n].setVelY(calcAngleMoveX(ang)*20);
        }
        //create Death Asteroid (kills half the other asteroids)
        for (int n = 0; n<DeathASTEROIDS; n++){
            ast2[n] = new DeathAsteroid();

            ast2[n].setX((double)rand.nextInt(1000)+20);
            ast2[n].setY((double)rand.nextInt(400)+20);
            ast2[n].setMoveAngle(rand.nextInt(360));
            double ang = ast2[n].getMoveAngle() -90;
            ast2[n].setVelX(calcAngleMoveX(ang)*30);
            ast2[n].setVelY(calcAngleMoveX(ang)*30);
        }
        //start the user input listener
        addKeyListener(this);
    }

    public void drawShip(){
        g2d.setTransform(identity);
        g2d.translate(ship.getX(), ship.getY());
        g2d.rotate(Math.toRadians(ship.getFaceAngle()));
        g2d.setColor(Color.BLUE);
        g2d.fill(ship.getShape());
    }

    public void drawBullets(){
        for (int n = 0; n< BULLETS; n++){
            if (bullet[n].isAlive()){
                g2d.setTransform(identity);
                g2d.translate(bullet[n].getX(),bullet[n].getY());
                g2d.setColor(Color.MAGENTA);
                g2d.draw(bullet[n].getShape());
            }
        }
    }

    public void drawBigBullets(){
        for (int n = 0; n< BULLETS; n++){
            if (bullet2[n].isAlive()){
                g2d.setTransform(identity);
                g2d.translate(bullet2[n].getX(),bullet2[n].getY());
                g2d.setColor(Color.RED);
                g2d.draw(bullet2[n].getShape());
            }
        }
    }

    public void updateShip(){
        ship.incX(ship.getVelX());
        if (ship.getX() <= 30)
            ship.setVelX(0);
        else if (ship.getX() >=970)
            ship.setVelX(0);
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

    public void updateBigBullets() {
        //move each of the bullets
        for (int n = 0; n < BULLETS; n++) {
            //is this bullet being used?
            if (bullet2[n].isAlive()) {

                //update bullet's x position
                bullet2[n].incX(bullet2[n].getVelX());

                //bullet disappears at left/right edge
                if (bullet2[n].getX() < 0 ||
                bullet2[n].getX() > getSize().width)
                {
                    bullet2[n].setAlive(false);
                }

                //update bullet's y position
                bullet2[n].incY(bullet2[n].getVelY());

                //bullet disappears at top/bottom edge
                if (bullet2[n].getY() < 0 ||
                bullet2[n].getY() > getSize().height)
                {
                    bullet2[n].setAlive(false);
                }
            }
        }
    }

    /*****************************************************
     * applet update event to redraw the screen
     *****************************************************/
    public void update(Graphics g) {
        //start off transforms at identity

        g2d.setTransform(identity);
        g2d.drawImage(background, 0, 0, this);
        g2d.setPaint(Color.ORANGE);
        g2d.fillRect(0, 590, 1000, 60);
        g2d.setPaint(Color.PINK);
        g2d.fillRect(0, 570, BBHealth, 20); 
        g2d.setPaint(Color.WHITE);
        Font myFont = new Font ("Arial", 1, 15);
        g2d.setFont (myFont);
        g2d.drawString("Coordinates: " + Math.round(ship.getX()) + "," + Math.round(ship.getY()) , 5, 20);
        g2d.drawString("SCORE: " + SCORE , 900, 20);
        g2d.setColor(Color.WHITE);
        Font myFont1 = new Font ("Courier New", 1, 30);
        g2d.setFont (myFont1);
        g2d.drawString ("Lives:" + LIVES, 850, 585);
        Font myFont2 = new Font ("Courier New", 1, 25);
        g2d.setFont (myFont2);
        g2d.drawString ("Health: " + HEALTH + health, 5, 565);
        g2d.drawString ("Level: " + (LEVEL-1), 440, 20);
        g2d.drawString (userName + "'s", 5, 545);

        drawShip();
        drawBullets();
        drawBigBullets();
        drawAsteroids();
        drawHealthAsteroids();
        drawDeathAsteroids();

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
                g2d.setColor(Color.RED);
                g2d.fill(ast[n].getShape());

            }
        }
    }

    public void drawHealthAsteroids() {

        //iterate through the asteroids array
        for (int n = 0; n < HealthASTEROIDS; n++) {

            //is this asteroid being used?
            if (ast1[n].isAlive()) {

                //draw the asteroid
                g2d.setTransform(identity);
                g2d.translate(ast1[n].getX(), ast1[n].getY());
                g2d.rotate(Math.toRadians(ast1[n].getMoveAngle()));
                g2d.setColor(Color.GREEN);
                g2d.fill(ast1[n].getShape());

            }
        }
    }

    public void drawDeathAsteroids() {

        //iterate through the asteroids array
        for (int n = 0; n < DeathASTEROIDS; n++) {

            //is this asteroid being used?
            if (ast2[n].isAlive()) {

                //draw the asteroid
                g2d.setTransform(identity);
                g2d.translate(ast2[n].getX(), ast2[n].getY());
                g2d.rotate(Math.toRadians(ast2[n].getMoveAngle()));
                g2d.setColor(Color.PINK);
                g2d.fill(ast2[n].getShape());

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
     * thread stop event
     *****************************************************/
    public void stop() {

        //kill the gameloop thread
        gameloop = null;
    }

    /*****************************************************
     * thread run event (game loop)
     *****************************************************/
    public void run() {

        //acquire the current thread
        Thread t = Thread.currentThread();

        try
        {
            if (LEVEL == 1){
                Theme.play();
            }
            else if (LEVEL == 5){
                Theme.stop(); 
                Theme.play();
            }
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }

        //keep going as long as the thread is alive
        while (t == gameloop) {
            try {
                //target framerate is 50 fps
                Thread.sleep(20);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            gameUpdate();
            repaint();
        }
    }

    /*****************************************************
     * move and animate the objects in the game
     *****************************************************/
    private void gameUpdate() {

        updateAsteroids();
        updateHealthAsteroids();
        updateDeathAsteroids();
        checkCollisions();
        updateShip();
        updateBullets();
        updateBigBullets();

        boolean lvlFinished = true;
        for(int n = 0; n<ASTEROIDS; n++){
            if(ast[n].isAlive()){
                lvlFinished = false;
            }
        }

        if (lvlFinished == true){
            Object[] possibleValue = { "Next Level", "QUIT"};
            Object selectedValue = JOptionPane.showInputDialog(null,
                    "Level " + LEVEL + " Completed", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValue, possibleValue[0]);
            LEVEL++;
            if (LEVEL == 5){
                Theme.stop();
            }
            if (selectedValue == "Next Level"){
                if (LEVEL == 7){
                    JOptionPane.showMessageDialog(null, "Bonus Round!");
                    ASTEROIDS = 3;
                    init();
                    start();
                    run();
                }
                else{
                    ASTEROIDS = 15;
                    init();
                    start();
                    run();
                }
            }
            else {
                gameloop=null;
            }
        }
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
                    ast[n].setVelX(-ast[n].getVelX());
                else if (ast[n].getX() > 990)
                    ast[n].setVelX(-ast[n].getVelX());

                //update the asteroid's Y value
                ast[n].incY(ast[n].getVelY());

                //warp the asteroid at screen edges
                if (ast[n].getY() < 10){
                    ast[n].setVelY(-ast[n].getVelY());
                }
                else if (ast[n].getY() > 630){
                    ast[n].setAlive(false);
                    HEALTH-=5;
                    BBHealth -=15;
                    if (HEALTH <=0){
                        Theme.stop();
                        Object[] possibleValues = { "Play Again", "QUIT"};
                        Object selectedValue = JOptionPane.showInputDialog(null,
                                "You died!    Your Score: " + SCORE, "Input",
                                JOptionPane.INFORMATION_MESSAGE, null,
                                possibleValues, possibleValues[0]);
                        if (selectedValue == "Play Again"){
                            LIVES = 3;
                            HEALTH = 100;
                            SCORE = 0;
                            Theme.play();
                            init();
                            start();
                            run();
                        }
                        else {
                            gameloop=null;
                        }
                    }

                    //update the asteroid's rotation

                    //keep the angle within 0-359 degrees
                }
            }
        }
    }

    /*****************************************************
     * Update the Shooting Star based on velocity
     *****************************************************/
    public void updateHealthAsteroids() {

        //move and rotate the asteroids
        for (int n = 0; n < HealthASTEROIDS; n++) {

            //is this asteroid being used?
            if (ast1[n].isAlive()) {

                //update the asteroid's X value
                ast1[n].incX(ast1[n].getVelX());

                //warp the asteroid at screen edges
                if (ast1[n].getX() < 10)
                    ast1[n].setVelX(-ast1[n].getVelX());
                else if (ast1[n].getX() > 990)
                    ast1[n].setVelX(-ast1[n].getVelX());

                //update the asteroid's Y value
                ast1[n].incY(ast1[n].getVelY());

                //warp the asteroid at screen edges
                if (ast1[n].getY() < 10){
                    ast1[n].setVelY(-ast1[n].getVelY());
                }
                else if (ast1[n].getY() > 630){
                    ast1[n].setVelY(-ast1[n].getVelY());
                }

                //update the asteroid's rotation

                //keep the angle within 0-359 degrees
            }
        }
    }

    public void updateDeathAsteroids() {

        //move and rotate the asteroids
        for (int n = 0; n < DeathASTEROIDS; n++) {
            //is this asteroid being used?
            if (ast2[n].isAlive()) {
                //update the asteroid's X value
                ast2[n].incX(ast2[n].getVelX());
                //warp the asteroid at screen edges
                if (ast2[n].getX() < -500)
                    ast2[n].setVelX(-ast2[n].getVelX());
                else if (ast2[n].getX() > 1500)
                    ast2[n].setVelX(-ast2[n].getVelX());
                //update the asteroid's Y value
                ast2[n].incY(ast2[n].getVelY());
                //warp the asteroid at screen edges
                if (ast2[n].getY() < -500){
                    ast2[n].setVelY(-ast2[n].getVelY());
                }
                else if (ast2[n].getY() > 630){
                    ast2[n].setVelY(-ast2[n].getVelY());
                }
                //update the asteroid's rotation
                //keep the angle within 0-359 degrees
            }
        }
    }

    /*****************************************************
     * Test asteroids for collisions with ship or bullets
     *****************************************************/
    public void checkCollisions() {
        for (int m = 0; m<ASTEROIDS; m++){
            if (ast[m].isAlive() && ast[m].getBounds().intersects(ship.getBounds())){
                ast[m].setAlive(false);
                ship.setX(500);
                ship.setY(620);
                ship.setFaceAngle(0);
                ship.setVelX(0);
                ship.setVelY(0);
                LIVES--;
                if (LIVES==0){
                    Theme.stop();
                    Object[] possibleValues = { "Play Again", "QUIT"};
                    Object selectedValue = JOptionPane.showInputDialog(null,
                            "You died!    Your Score: " + SCORE, "Input",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            possibleValues, possibleValues[0]);
                    if (selectedValue == "Play Again"){
                        LIVES = 3;
                        HEALTH = 100;
                        SCORE = 0;
                        Theme.play();
                        init();
                        start();
                        run();
                    }
                    else {
                        gameloop=null;
                    }
                }
                continue;
            }

            if (ast[m].isAlive()){
                for (int n = 0; n< BULLETS; n++){
                    if (bullet[n].isAlive()){
                        if (ast[m].getBounds().contains(bullet[n].getX(), bullet[n].getY())){
                            bullet[n].setAlive(false);
                            ast[m].setAlive(false);
                            if (LEVEL == 7){
                                SCORE += 1000;
                                continue;
                            }
                            else{
                                SCORE += 50;
                                continue;
                            }
                        }
                    }
                    if (bullet2[n].isAlive()){
                        if (ast[m].getBounds().contains(bullet2[n].getX(), bullet2[n].getY())){
                            bullet2[n].setAlive(false);
                            ast[m].setAlive(false);
                            if (LEVEL == 7){
                                SCORE += 1000;
                                continue;
                            }
                            else{
                                SCORE += 50;
                                continue;
                            }
                        }
                    }
                }
            }

        }

        for (int m = 0; m<HealthASTEROIDS; m++){
            if (LEVEL == 7){ ast1[m].setAlive(false);}
            else if (ast1[m].isAlive()){
                for (int n= 0; n<BULLETS; n++){
                    if (bullet[n].isAlive()){
                        if (ast1[m].getBounds().contains(bullet[n].getX(), bullet[n].getY())){
                            bullet[n].setAlive(false);
                            ast1[m].setAlive(false);
                            SCORE += 100;
                            HEALTH +=10;
                            BBHealth+=10;
                            continue;
                        }
                    }
                    if (bullet2[n].isAlive()){
                        if (ast1[m].getBounds().contains(bullet2[n].getX(), bullet2[n].getY())){
                            bullet2[n].setAlive(false);
                            ast1[m].setAlive(false);
                            if (LEVEL == 7){
                                SCORE += 1000;
                                HEALTH +=10;
                                BBHealth+=10;
                                continue;
                            }
                            else{
                                SCORE += 100;
                                HEALTH +=10;
                                BBHealth+=10;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        for (int m = 0; m<DeathASTEROIDS; m++){
            if (LEVEL == 7){ ast2[m].setAlive(false);}
            else if (ast2[m].isAlive()){
                for (int n= 0; n<BULLETS; n++){
                    if (bullet[n].isAlive()){
                        if (ast2[m].getBounds().contains(bullet[n].getX(), bullet[n].getY())){
                            bullet[n].setAlive(false);
                            ast2[m].setAlive(false);
                            SCORE += 250;
                            ASTEROIDS /= 2;
                            continue;
                        }
                    }
                    if (bullet2[n].isAlive()){
                        if (ast2[m].getBounds().contains(bullet2[n].getX(), bullet2[n].getY())){
                            bullet2[n].setAlive(false);
                            ast2[m].setAlive(false);
                            SCORE += 250;
                            ASTEROIDS /= 2;
                            continue;
                        }
                    }

                }
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
            ship.setFaceAngle(0);
            ship.setVelX(0);            
            ship.incVelX(calcAngleMoveX(ship.getMoveAngle()) * -5);
            break;

            case KeyEvent.VK_RIGHT:

            ship.setFaceAngle(0);
            ship.setVelX(0);
            ship.incVelX(calcAngleMoveX(ship.getMoveAngle()) * 5);
            break;

            case KeyEvent.VK_SPACE:
            //fire a bullet
            currentBullet++;
            try
            {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("Rifle Gun Shot-SoundBible.com-1143231822.wav")));
                clip.start();
            }
            catch (Exception exc)
            {
                exc.printStackTrace(System.out);
            }
            if (currentBullet > BULLETS - 1) currentBullet = 0;
            bullet[currentBullet].setAlive(true);

            //point bullet in same direction ship is facing
            bullet[currentBullet].setX(ship.getX());
            bullet[currentBullet].setY(ship.getY());
            bullet[currentBullet].setMoveAngle(270);

            //fire bullet at angle of the ship
            double angle = bullet[currentBullet].getMoveAngle();
            double svx = ship.getVelX();
            double svy = ship.getVelY();
            bullet[currentBullet].setVelY(svy + calcAngleMoveY(angle) * 20);
            break;

            case KeyEvent.VK_A:
            //fire a bullet
            currentBullet++;
            try
            {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("Grenade-SoundBible.com-1777900486.wav")));
                clip.start();
            }
            catch (Exception exc)
            {
                exc.printStackTrace(System.out);
            }
            if (currentBullet > BULLETS - 1) currentBullet = 0;
            bullet2[currentBullet].setAlive(true);

            //point bullet in same direction ship is facing
            bullet2[currentBullet].setX(ship.getX());
            bullet2[currentBullet].setY(ship.getY());
            bullet2[currentBullet].setMoveAngle(0);

            //fire bullet at angle of the ship
            angle = bullet2[currentBullet].getMoveAngle();
            svx = ship.getVelX();
            svy = ship.getVelY();
            bullet2[currentBullet].setVelX(svx  * 5);
            bullet2[currentBullet].setVelY(svy * 5);
            break;
        } 

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

