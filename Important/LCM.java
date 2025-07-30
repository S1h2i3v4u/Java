package Project9;
// Find the least common multiple (LCM) of two numbers using while loop

/*
 * num1 = 4   num2 = 6
 * max(2,6) = 6
 * 
 * conditions 
 * 6 % 4 == 0?	
 * 6 % 6 == 0?	
 * 
 * check (6, 7, 8, 9, 10, 11, 12) which number is divisible by both number
 * 
 * 12 is the first number divisible by both → LCM = 12
 */
import java.util.*;

public class Lcm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = scanner.nextInt();

        int max = Math.max(num1, num2); 

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.println("Least Common Multiple of " + num1 + " and " + num2 + " is: " + max);
                break;
            }
            max++;
        }

        scanner.close();
    }
}
