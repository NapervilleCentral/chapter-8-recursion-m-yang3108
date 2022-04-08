import java.util.Random;

/**
   A tester class for the recursive sum.
*/
public class DataSetDemo
{
   public static void main(String[] args)
   {
      final int LENGTH = 10;
      int[] values = new int[LENGTH];
      
      for (int i = 0; i < values.length; i++)
      {
         values[i] = i - 5;
      }
      DataSet d = new DataSet(values, 0, values.length - 1);
      System.out.println("Sum: " + d.getSum());
      System.out.println("Expected: -5");
   }
}
