
/**
 * Write a description of class GetRichQuick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GetRichQuick
{
    // instance variables - replace the example below with your own
    private int dollar;
    private int numberofpayer;

    /**
     * Constructor for objects of class GetRichQuick
     */
    public GetRichQuick()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int collect(int monetaryGoal)
    {
        if (dollar == 1)
            return numberofpayer;

        else
        {
            collect(monetaryGoal);
            dollar = dollar / 10;
            return dollar + numberofpayer;
        }
    }
}