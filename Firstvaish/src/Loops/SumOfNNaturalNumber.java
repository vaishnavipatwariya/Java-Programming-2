package Loops;
import java.util.Scanner;
public class SumOfNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num<=n){
            sum = sum + num;
            System.out.println(sum);
            num++;
        }
        System.out.println(sum);
    }
}
