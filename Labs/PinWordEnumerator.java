import java.util.Scanner;

/**
 * Michael Yang
 * 4/24/22
   Converts a numeric pin to an equivalent word using the digit to
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator
{
    private static String wordy = "";
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);
        enumerateWords(num);
    }

    /**
       A wrapper for a recursive method that enumerates all the
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    public static void enumerateWords(String n)
    {
         enumerateWords(n, wordy);
    }

    /**
     *  Recursively generates all possible 'words' that represent
        the telephone keypad encoding of a number.    
        @param pin the number
        @param word representing the encoding of the pin
         */
    public static void enumerateWords(String pin, String word)
    {
        if (pin.length() == 0)
            System.out.printf("%s%n",wordy);
        else
        {
            String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
            for (int i = 0; i < map[Integer.parseInt(pin.substring(0, 1))].length(); i++)
            {
                wordy = word;
                wordy += map[Integer.parseInt(pin.substring(0, 1))].substring(i, i+1);
                enumerateWords(pin.substring(1), wordy);
            }
        }
    }

}
