public class Palindromes
{
    public static void main(String[] args)
    {
        String sentence1 = "Madam, I'm Adam!";
        System.out.println(sentence1);
        System.out.println("Palindrome: " + isPalindrome(sentence1));
        String sentence2 = "Sir, I'm Eve!";
        System.out.println(sentence2);
        System.out.println("Palindrome: " + isPalindrome(sentence2));
        String sentence3 = "Sir, I'm Eve!";
        System.out.println(sentence3);
        System.out.println("Palindrome: " + isPalindrome(sentence3));
    }

    /**
     * test whether a text is a palindrome
     * @param text a string that is being checked
     * @ return true if text is pal, false otherwise
     */

    public static boolean isPalindrome(String text)
    {
        int length = text.length();

        //base case
        if (length <= 1)
        {
            return true;
        }
        else 
        {
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length - 1));

            //both are letters

            if(Character.isLetter(first) && Character.isLetter(last))
            {

                if (first == last)
                {
                    //remove first + last characters
                    String shorter = text.substring(1, length - 1);
                    return isPalindrome(shorter);

                }

            }

            else
                return false;
        }
        return false;
    }

}

