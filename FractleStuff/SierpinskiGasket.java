import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class SierpinskiGasket extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    /*
    //x is accross and y is down
    point 1 - Right  A
    point 2 - Left   B
    point 3 - Top    C
    point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
     */
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    int bicect;
    

    //-----------------------------------------------------------------
    //  Sets up the basic applet environment.
    //-----------------------------------------------------------------
    public SierpinskiGasket()
    {

        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        page.setColor (Color.white);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);
        
        //draws the large middle triangle
    }

    /** Draws a triangle  in the middle of the 3 x,y points provided
    finds the midpoints of triangles line segments
    uses midpoint to draw a triangle inside of the points provided

    @param array of 4 points a -> b -> c -> a

     */

    public void Triangle(int[] xPos, int[] yPos, Graphics page)
    {
        int dxsquared = (int)Math.pow(xPos[0] - xPos[1],2);
        int dysquared = (int)Math.pow(yPos[0] - yPos[1],2);
        int distance = (int)Math.sqrt(dxsquared + dysquared);

        distance *= 0.5; // increasingly smaller distance

        if (distance > 4)
        {
            //find midpoints and draw triangle
            int ABMidx = ((xPos[0] + xPos[1]) / 2);
            int ABMidy = ((yPos[0] + yPos[1]) / 2);
            int BCMidx = ((xPos[1] + xPos[2]) / 2);
            int BCMidy = ((yPos[1] + yPos[2]) / 2);
            int ACMidx = ((xPos[0] + xPos[2]) / 2);
            int ACMidy = ((yPos[0] + yPos[2]) / 2);

            int [] x = {ABMidx, BCMidx, ACMidx, ABMidx};
            int [] y = {ABMidy, BCMidy, ACMidy, ABMidy};

            //draw the triangle
            page.drawPolyline (x, y, x.length);

            //call the 3 new triangles
            // bottom right subtriangle
            x = new int[] {xPos[0], ABMidx, ACMidx, xPos[0]};
            y = new int[] {yPos[0], ABMidy, ACMidy, yPos[0]};
            page.setColor(Color.red);
            Triangle(x, y, page);

            // bottom left subtriangle
            x = new int[] {xPos[1], ABMidx, BCMidx, xPos[1]};
            y = new int[] {yPos[1], ABMidy, BCMidy, yPos[1]};
            page.setColor(Color.orange);
            Triangle(x, y, page);
           

            // top subtriangle
            x = new int[] {xPos[2], ACMidx, BCMidx, xPos[2]};
            y = new int[] {yPos[2], ACMidy, BCMidy, yPos[2]};
            page.setColor(Color.yellow);
            Triangle(x, y, page);

        }
    }//end of Triangle
}
