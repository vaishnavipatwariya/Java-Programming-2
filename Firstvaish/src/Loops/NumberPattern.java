package Loops;

public class NumberPattern {
    public static void main(String[] args) {
    int rows = 4;  // Number of rows

    // Loop through each row
    for (int i = 1; i <= rows; i++) {
        // Print leading spaces for alignment
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // Print the first number
        System.out.print(i);

        // For rows 2 and 3, print spaces between the numbers
        if (i == 2) {
            System.out.print(" ");  // 1 space between two 2's
            System.out.print(i);    // Print second 2
        } else if (i == 3) {
            System.out.print("   ");  // 3 spaces between two 3's
            System.out.print(i);      // Print second 3
        }

        // For row 4, print 7 fours
        if (i == 4) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(i);
            }
        }

        // Move to the next line
        System.out.println();
    }
}
}


