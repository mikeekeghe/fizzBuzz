/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author mike
 */
public class FizzBuzz {

    private static String output;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String FIZZ = "Fizz";
   final String BUZZ = "Buzz";
    final String FIZZ_BUZZ = "FizzBuzz";
        for (int number = 1; number <= n; number++) {

                // If number is divisible by 15 ( 5 * 3)
                if (number % 15 == 0) {
                    System.out.printf("%s ", FIZZ_BUZZ);
                                System.out.print("\n");

                } else if (number % 3 == 0) { // If number is divisible by 3
                    System.out.printf("%s ", FIZZ);
                                                    System.out.print("\n");

                } else if (number % 5 == 0) { // If number is divisible by 5
                    System.out.printf("%s ", BUZZ);
                                                    System.out.print("\n");

                } else {
                    System.out.printf("%d ", number);
                                                    System.out.print("\n");

                }
            }

    }


}
