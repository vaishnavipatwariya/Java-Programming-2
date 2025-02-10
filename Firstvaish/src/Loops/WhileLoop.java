package Loops;
import java.util.Scanner;
public class WhileLoop {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();

    int num = 1;
    while(num <= n){
        System.out.println(num);
//        System.out.println();
//        num = num + 1;
        num++;//num = num + 1;
    }
}
}
