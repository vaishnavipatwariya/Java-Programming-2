package Loops;
import java.util.Scanner;
public class PrintNumExcept3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        for(int num = 1 ; num <= 20 ; num++){
//            if(num == 3){
//                continue;
//            }
//            System.out.println(num);
//        }

        int num = 1;
        while(num <= 20){
            if(num==3){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
