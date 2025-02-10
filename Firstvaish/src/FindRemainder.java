//take two integers input a and b: a>b, and find the remainder when a is divided by b.

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor :");
        int b = sc.nextInt();
        int q = a/b;
        int r = a % b;
      //or  int r = a - (b*q); //
        // Divisor * Quotient + Remainder = Dividend
        //Remainder = Dividend(a) - divisor(b) * quotient
        System.out.println("The remainder when " +a+ " is divided by " +b+ " is : " +r);
    }
}
