package ProblemsOnLoops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;

        while(n > 0) {
            n = n / 10;
            numOfDigits++; //numOfDigits = numOfDigits + 1
        }
        System.out.println("Number of digits in " +original_n+ " = " +numOfDigits);
    }
}
