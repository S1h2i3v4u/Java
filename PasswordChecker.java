package Project9;
import java.util.*;
// do-while Loop
public class PasswordChecker {
	
	// Method to check if the password is valid
    // In this case, the password is valid if its length is greater than 6
	public static boolean isValidPassword(String Password) {
		return Password.length() > 6;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcom to password checker ");
		
		String Password;
		 // Use a do-while loop to repeatedly ask for input until a valid password is entered 
		do {                          
			System.out.print("Enter the password :");
			Password = sc.next();
		}while(!isValidPassword(Password));           // Continue looping if the password is not valid
		
		System.out.println("Correct Password");
	
	}

}
