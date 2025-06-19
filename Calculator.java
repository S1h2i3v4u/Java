package mit;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int a,b;
	
		do {
			System.out.println("=== You can do === \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulus \n 5.Exit");
			
			System.out.print("Enetr your choice : ");
		    choice = sc.nextInt();
			
			
			
			switch(choice) {
			case 1:
				System.out.print("Enter value of a :");
				a = sc.nextInt();
				System.out.print("Enter value of b :");
				b = sc.nextInt();
				System.out.println("Addition is :" + (a + b));
				break;
			case 2:
				System.out.print("Enter value of a :");
				a = sc.nextInt();
				System.out.print("Enter value of b :");
				b = sc.nextInt();
				System.out.println("Substraction  is :" +(a - b));
				break;
			case 3:
				System.out.print("Enter value of a :");
				a = sc.nextInt();
				System.out.print("Enter value of b :");
				b = sc.nextInt();
				System.out.println("Multiplication is :" + (a * b));
				break;
			case 4:
				System.out.print("Enter value of a :");
				a = sc.nextInt();
				System.out.print("Enter value of b :");
				b = sc.nextInt();
				System.out.println("Division is :" + (a / b));
				break;
			case 5:
				System.out.print("Enter value of a :");
				a = sc.nextInt();
				System.out.print("Enter value of b :");
				b = sc.nextInt();
				System.out.println("Modulus is :" + (a % b));
				break;
				
			 default:
	             System.out.println("Invalid choice!");
			} 
			} while(choice != 6 );

			 sc.close();
		}
	}


			
			
			
		
		
