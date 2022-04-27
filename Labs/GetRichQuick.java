
/**
 * Michael Yang
 * 4/23/22
 * GetRichQuick lab - pyramid scheme
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
     * @param monetaryGoal which is the target amount of money needed to be raised
     * 
     */
    public static int collect(int monetaryGoal)
    {
        if (monetaryGoal <= 1) //base case which returns one
            return 1;

        else
        {
            return monetaryGoal + collect(monetaryGoal / 10); //recursive procedure
            //that divides by 10 to increase the total number of people until the
            //base case is met
        }
    }
}
