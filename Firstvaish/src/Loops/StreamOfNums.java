package Loops;
import java.util.Scanner;
public class StreamOfNums {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != -1){
            sum += num;
            num = sc.nextInt();
        }
//        do{
//            sum += num;
//            num = sc.nextInt();
//        }while(num != -1);
//        System.out.println(sum);   //do while loop me first iteration to run hogi hi second iteration se check hogi condition if we take -1 in first iteration then it will print -1
    }
}