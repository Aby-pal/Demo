package Demo.demo;

import java.util.Scanner;
class DecimalToHexExample
{
     public static void main(String args[])
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      float num =input.nextFloat();
        
      // calling method toHexString()
      String str = Float.toHexString(num);
      System.out.println("Method 1: Decimal to hexadecimal: "+str);
    }
}