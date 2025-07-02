package mit;

//converts temperature from Celsius to Fahrenheit using the standard conversion formula.
//[Fahrenheit = (Celsius × 9/5) + 32]

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// Convert temperature from C to F
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsius :");
		float celsius = sc.nextInt();
		
		float Fahrenheit = ((celsius * 9/5) + 32);     //F = (C × 9/5) + 32

		System.out.println("Temperature Celsius to Fahrenheit is :" +Fahrenheit + "F");

	}

}
