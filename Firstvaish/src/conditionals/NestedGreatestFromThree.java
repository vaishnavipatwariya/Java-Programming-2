package conditionals;
import java.util.Scanner;
public class NestedGreatestFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest ");
            } else {
                System.out.println(c + " is largest");

            }
        } else { //a<b
            if (b > c) {
                System.out.println(b + " is largest ");


            } else {
                System.out.println(c + " is largest ");
            }

        }
    }
}

