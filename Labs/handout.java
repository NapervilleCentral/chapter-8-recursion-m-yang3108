/**
 * Write a description of class handout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class handout
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class handout
     */
    public handout()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void method1(int n)
    {
        n = Math.abs(n);
        System.out.println(n);
        if(n > 0)
            method1(n-1);
        
    }

    public static void method2(int n)
    {
        n = Math.abs(n);        
        if(n > 0)
             method1(n+1);
        System.out.println(n);
    }
}
