package mit;
//This is a simple Java console-based application that takes input from students, including their names and marks in 5 subjects, calculates their total marks, percentage, and displays the grade card.
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// Grade Card
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter the marks of Math :");
		int math = sc.nextInt();
		System.out.print("Enter the marks of Bio :");
		int Bio = sc.nextInt();
		System.out.print("Enter the marks of Phy :");
		int Phy = sc.nextInt();
		System.out.print("Enter the marks of CC :");
		int CC = sc.nextInt();
		System.out.print("Enter the marks of Java :");
		int java = sc.nextInt();
		
		System.out.println("===Grade Card===");
		System.out.println("Name :" +name);
		
		int total = math+Bio+Phy+CC+java;
		System.out.println("Total Marks is : " + total);
		
		int percentage = total/5;
		System.out.println("Percentage is : " + percentage+"%");
		
	
		if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
		}
		

	}


