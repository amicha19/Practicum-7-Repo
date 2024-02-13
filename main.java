// Practicum 7 - Fahrenheit to Celsius Program

// ----------------------------------------------------------
// This program will convert Fahrenheit to Celsius
// ----------------------------------------------------------

import java.util.Scanner;


public class practicumnum7 {
    public static void main (String [] args) {

        double fahrenheit;
        double celsius;

      Scanner user = new Scanner (System.in);

      System.out.println("please enter the temp (in fahrenheit):");
      fahrenheit = user.nextDouble();

      celsius = celsius_conversion(fahrenheit);

      System.out.printf("%.1f" + "degrees fahrenheit = " + "degrees celsius"}

              public static double celsius_conversion (double convert) {
                return (convert - 32) * 5 / 9.0;
              }
}

