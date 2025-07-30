package Project9;

import java.util.*;

// Demonstrates use of 'continue' keyword to skip negative numbers while summing
public class Continue_Keyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to adding positive numbers!");

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int num : arr) {
            if (num < 0) {
                continue;        // Skip negative number
            }
            sum += num;
        }

        System.out.println("The sum of positive numbers is: " + sum);
        sc.close(); 
    }
}
