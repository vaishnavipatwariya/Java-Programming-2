import java.util.Scanner;
public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int rows = sc.nextInt(); // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces for the flipped effect
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    }
