package Loops;
import java.util.Scanner;
public class FristMultipleOf5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while(true){
           if((num % 5 == 0) && (num % 7 == 0)){
               System.out.println("Found answer : " +num);
               break;
           }
           num++;
        }

//        for (int num = 1; num <= 50; num++) {
//            if ((num % 5 == 0) && (num % 7 == 0)) {
//                System.out.println("Found answer : " + num);
//                break;
//            }
//        }
    }
}
