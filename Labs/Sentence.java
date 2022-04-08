
/**
 * Write a description of class Sentence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sentence 
{
    // instance variables - replace the example below with your own
    private String sentence;

    /**
     * Constructor for objects of class Sentence
     */
    public Sentence(String s)
    {
        // initialise instance variables
        sentence = s;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean find(String s)
    {
        if (sentence.length()-s.length() < 1)
        {
            return false;
        }

        if (sentence.substring(0,s.length()).equals(s))
        {
            return true;
        }
        sentence = sentence.substring(1);
        return find(s);

    }

}
