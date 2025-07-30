package Project9;
import java.util.*;

//use of break keyword
public class Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter the command :");
		String s1 = sc.next();
		
		if(s1.equalsIgnoreCase("exit")) {    //equalsIgnoreCase - allow both upper and lower case exit (case-insensitive)
			break;
			}
		}
	System.out.println("exiting....");
	}

}
