package Project9;
//Fibonacci series = Each number is the sum of the previous two. [0,1,1,2,3,5,8,13,21,34...]

public class FibonacciSeries {

	public static void main(String[] args) {
		
		        int n = 10; 

		        int first = 0;
		        int second = 1;

		        System.out.println("Fibonacci Series up to " + n + " terms:");

		        for (int i = 1; i <= n; i++) {
		            System.out.print(first + " ");

		            int next = first + second;
		            first = second;
		            second = next;
		        }
		    }
		

	}

	
