package Project9;

import java.util.Scanner;

// Greatest Common Divisor (GCD) using while loop
/*
 * Example:
 *  num1 = 20, num2 = 30
 *  
 *  i = 1 to min(num1, num2)
 *  Check if num1 % i == 0 && num2 % i == 0
 *  Common divisors are: 1, 2, 5, 10
 *  GCD is the greatest of them => 10
 */

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int num1, int num2) {
        int i = 1;
        int gcd = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; 
            }
            i++;
        }

        return gcd;
    }
}
