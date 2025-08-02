package StringDemo;
/* Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 * 123 = 1^3 + 2^3 + 3^3 =1+8+27 = 36 != 123 (Not Armstrong number) 
 * 153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 127 == 127 (Armstrong number)
 * number of digit is 123 is = 3 
 */
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else { 
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Count the number of digits
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}

