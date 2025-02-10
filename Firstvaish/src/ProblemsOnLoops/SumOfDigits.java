package ProblemsOnLoops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int original_n = n;
        //any number % 10 = last digit of number
        while(n>0){
            sumOfDigits += n % 10;
            n = n / 10;
        }
        System.out.println(" Sum of digits in " + original_n + " = " +sumOfDigits);
    }
}

