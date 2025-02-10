package Loops;
import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();
        // int num = n;
        //for(; num >= 1; num-=2){
        //or
        //int num = n;
        //for(; num >=1 ;){
        //System.out.println(num);
        // num -=2;
   
       for(int num = n ; num >= 1; num-=2)  {  //num -= 2, num = num - 2
       System.out.println(num);
        }
    }
}
