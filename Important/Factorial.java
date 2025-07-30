package Project9;
//Calculate factorial of the given number 

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int num1 = sc.nextInt();
		
		
		long fact = 1;
		for(int i = 1; i <= num1; i++) {
			 fact *= i;
		}
			System.out.println("factorial of " + num1 +" is : "+ fact);
			
			sc.close();
		}

	}


