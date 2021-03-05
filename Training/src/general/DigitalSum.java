package general;
import java.util.Scanner;

public class DigitalSum {

   // method to find digital sum
   public static int digitalSum(int number) {
      if(number == 0) return 0;
      else if(number % 9 == 0) 
        return 9;
      else
        return number%9;
   }

   // main method
   public static void main(String[] args) {

      // declare variables
      int number = 0;
      int sumOfDigitsUntilSingle = 0;

      // create Scanner class object 
      // for reading the values
      Scanner scan =  new Scanner(System.in);

      // read input
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();

      // find sum of digits of number
      sumOfDigitsUntilSingle = digitalSum(number);

      // display result
      System.out.println("The sum of digits until" +
         " single digit of the number "+number+
         " = "+sumOfDigitsUntilSingle);

      // close Scanner class object
      scan.close();
  }
}