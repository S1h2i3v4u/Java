package Methods;
import java.util.*;

public class patternRevision {

    static Scanner sc = new Scanner(System.in);

    
    public static int readRow() {
        System.out.print("Enter number of rows: ");
        return sc.nextInt();
    }

  // Star Pattern

    public static void triangle_pattern() {
        int row = readRow();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
            	System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
            	System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void square_pattern() {
        System.out.print("Enter side length: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_square_pattern() {
        System.out.print("Enter side length: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                	System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void rectangle_pattern() {
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void right_align_triangle() {
        int row = readRow();
        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
            	System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_right_align_triangle() {
        int row = readRow();
        for (int i = row; i >= 1; i--) {
            for (int j = row; j > i; j--) {
            	System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void left_align_triangle() {
        int row = readRow();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_left_align_triangle() {
        int row = readRow();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
    }

    //  Number Patterns

    public static void number_triangle() {
        int row = readRow();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void continuous_number_triangle() {
        int row = readRow();
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print(num++ + " ");
            
            }
            System.out.println();
        }
    }

    public static void centered_number_pyramid() {
        int row = readRow();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
            	System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
            	System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void centered_continuous_number_pyramid() {
        int row = readRow();
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
            	System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
            	System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

   
    // main 

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWhat would you like to print?");
            System.out.println("1. Star Pattern");
            System.out.println("2. Number Pattern");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    while (true) {
                        System.out.println("\nStar Pattern Menu:");
                        System.out.println("1. Centered Triangle Pattern");
                        System.out.println("2. Square Pattern");
                        System.out.println("3. Hollow Square Pattern");
                        System.out.println("4. Rectangle Pattern");
                        System.out.println("5. Right Aligned Triangle");
                        System.out.println("6. Inverted Right Aligned Triangle");
                        System.out.println("7. Left Aligned Triangle");
                        System.out.println("8. Inverted Left Aligned Triangle");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int starChoice = sc.nextInt();

                        switch (starChoice) {
                            case 1: triangle_pattern(); 
                                    break;
                            case 2: square_pattern();
                                    break;
                            case 3: hollow_square_pattern(); 
                                    break;
                            case 4: rectangle_pattern();
                                    break;
                            case 5: right_align_triangle(); 
                                    break;
                            case 6: inverted_right_align_triangle();
                                    break;
                            case 7: left_align_triangle(); 
                                    break;
                            case 8: inverted_left_align_triangle(); 
                                    break;
                            case 0: break;
                            default:
                            	
                            System.out.println("Invalid choice. Try again.");
                        }

                        if (starChoice == 0) break;
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\nNumber Pattern Menu:");
                        System.out.println("1. Number Triangle (1 to i)");
                        System.out.println("2. Continuous Number Triangle");
                        System.out.println("3. Centered Number Pyramid");
                        System.out.println("4. Centered Continuous Number Pyramid");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int ch = sc.nextInt();

                        switch (ch) {
                            case 1: number_triangle();
                                    break;
                            case 2: continuous_number_triangle(); 
                                    break;
                            case 3: centered_number_pyramid(); 
                                    break;
                            case 4: centered_continuous_number_pyramid();
                                    break;
                            case 0:
                            	       break;
                            default: 
                            	
                            	System.out.println("Invalid choice. Try again.");
                        }

                        if (ch == 0) break;
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
