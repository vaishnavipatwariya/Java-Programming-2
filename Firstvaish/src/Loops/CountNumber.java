package Loops;
import java.util.*;
public class CountNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;

        while (n>0){
            n=n/10;
            numOfDigits++;// numberOfDigits = numOfDigits+1

        }
            System.out.println("Number of digits in "+n + " = " + numOfDigits);
        }
}
