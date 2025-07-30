package Project9;
// Palindrom - original and reverse are same [ madam , radar ] 
//for String

import java.util.Scanner;

public class Palindrom1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String original = input.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(original).reverse().toString();
        
        if (original.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
