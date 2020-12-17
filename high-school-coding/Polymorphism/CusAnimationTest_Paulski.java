import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.image.*;
import java.net.*;

public class CusAnimationTest_Paulski extends Applet  implements Runnable {
    static int SCREENWIDTH = 640;
    static int SCREENHEIGHT = 480;
    Thread gameloop;
    Random rand = new Random();

    //double buffer objects
    BufferedImage backbuffer;
    Graphics2D g2d;

    Image background;

    //sprite variables
    Image ball;
    int ballX = 300, ballY = 200;
    int speedX, speedY;

    //animation variables
    int currentFrame = 0;
    int totalFrames = 64;
    int animationDirection = 1;
    int frameCount = 0;
    int frameDelay = 5;

    private URL getURL(String filename) {
        URL url = null;
        try {
            url = this.getClass().getResource(filename);
        }
        catch (Exception e) {}
        return url;
    }

    public void init() {
        Toolkit tk = Toolkit.getDefaultToolkit();

        //create the back buffer for smooth graphics
        backbuffer = new BufferedImage(SCREENWIDTH, SCREENHEIGHT,
            BufferedImage.TYPE_INT_RGB);
        g2d = backbuffer.createGraphics();

        //load the background image
        background = tk.getImage(getURL("spacce.png"));

        //load the ball animation strip
        ball = tk.getImage(getURL("ship360_64_0.png "));

        speedX = rand.nextInt(6)+1;
        speedY = rand.nextInt(6)+1;

    }

    public void start() {
        gameloop = new Thread(this);
        gameloop.start();
    }

    public void stop() {
        gameloop = null;
    }

    public void run() {
        Thread t = Thread.currentThread();
        while (t == gameloop) {
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameUpdate();
            repaint();
        }
    }

    public void gameUpdate() {
        frameCount++;

        if (frameCount > frameDelay) {
            frameCount=0;
            ballX += speedX;  
            ballY += speedY;  
            if(ballX <= 0)
            {
                speedX=speedX*(-1);
            }
            if(ballX >= (SCREENWIDTH-64))
            {
                speedX=speedX*(-1);
                ballX = SCREENWIDTH-64;
            }
            if(ballY <= 0)
            {
                speedY=speedY*(-1);
            }
            if(ballY >= (SCREENHEIGHT-64))
            {
                speedY=speedY*(-1);
                ballY = SCREENHEIGHT-64;
            }

            currentFrame += animationDirection;
            if (currentFrame > totalFrames - 1) {
                currentFrame = 0;
            }
            else if (currentFrame < 0) {
                currentFrame = totalFrames - 1;
            }
        } 

    }

    public void update(Graphics g) {
        //draw the background
        g2d.drawImage(background, 0, 0, SCREENWIDTH-1, SCREENHEIGHT-1, this);

        //draw the current frame of animation
        drawFrame(ball, g2d, ballX, ballY, 8, currentFrame, 64, 64);

        g2d.setColor(Color.BLACK);
        g2d.drawString("Position: " + ballX + "," + ballY, 5, 10);
        g2d.drawString("Velocity: " + speedX + "," + speedY, 5, 25);
        g2d.drawString("Animation: " + currentFrame, 5, 40);

        paint(g);
    }

    public void paint(Graphics g) {
        //draw the back buffer to the screen
        g.drawImage(backbuffer, 0, 0, this);
    }

    //draw a single frame of animation
    public void drawFrame(Image source, Graphics2D dest,
    int x, int y, int cols, int frame,
    int width, int height)
    {
        int fx = (frame % cols) * width;
        int fy = (frame / cols) * height;
        dest.drawImage(source, x, y, x+width, y+height,
            fx, fy, fx+width, fy+height, this);
    }

}
