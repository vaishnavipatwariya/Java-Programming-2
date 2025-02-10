package Loops;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter n : ");
       int n = sc.nextInt();

       for(int num = 1; num <= n; num++){
           System.out.println(num);
       }
    }
}
