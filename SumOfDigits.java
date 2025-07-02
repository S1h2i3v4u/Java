package Project9;

// Calculate the sum of digits in an integer. Example: 234 = 2 + 3 + 4 = 9

import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Integer :");
		int num = sc.nextInt();
		
		int sum = 0;
		while(num>0) {
			sum += num % 10;
			num /= 10;
			
		}
			System.out.print("Sum of Digint in Integer is : " +sum);
			
			sc.close();
			
		}
}
		
		
		

