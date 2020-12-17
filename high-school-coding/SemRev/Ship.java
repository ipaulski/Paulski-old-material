import java.awt.Polygon;
import java.awt.Rectangle;
import java.lang.Object;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Float;
import java.awt.geom.GeneralPath;
public class Ship extends BaseVectorShape {
    //define the ship polygon
    private int[] shipx = { -8, -8, -7, -7, -6, -6, -5, -5, -4, -4, -2, -2, -1, -1, 1, 1, 2, 2, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1,
            1, -1, -1, -2, -2, -3, -3, -4, -4, -5, -5, -6, -6, -7, -7};
    private int[] shipy = { 1, -7, -7, -6, -6, -5 , -5, -4, -4, -6, -6, -5, -5, -9, -9, -5, -5, -6, -6, -4, -4, -5, -5, -6, -6, -7, -7, 1, 1, -3, -3, -2, -2, 4, 4, 1, 1, 2, 2, 6,6,
            9, 9, 6, 6, 2, 2, 1, 1, 4, 4, -2, -2, -3, -3, 1};

    //bounding rectangle
    public Rectangle getBounds() {
        Rectangle r;
        r = new Rectangle((int)getX() - 6, (int) getY() - 6, 12,12);
        return r;
    }

    Ship() {
        GeneralPath polygon = 
            new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                shipx.length);
        polygon.moveTo(shipx[0], shipy[0]);

        for (int index = 1; index < shipx.length; index++) {
            polygon.lineTo(shipx[index], shipy[index]);
        };
        polygon.closePath();
        setShape(polygon);
        setAlive(true);
    }
}
