
/**
 * Write a description of class GCD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCD
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class GCD
     */
    public GCD(int num1, int num2)
    {
        x = num1;
        y = num2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int gcd(int num1, int num2)
    {
        if (num1 <= num2 && num1 % num2 == 0)
            return num2;
        if (num1 < num2)
            return gcd (num2, num1);
        else
            return gcd(num2, num1%num2);
        
    }
}
