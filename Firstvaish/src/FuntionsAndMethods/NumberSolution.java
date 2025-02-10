package FuntionsAndMethods;

import java.util.Scanner;

public class NumberSolution {
    public static void main(String args[]){
        int  positive = 0;
        int  negative = 0;
        int zero = 0;
        System.out.println("press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input == 1){
            System.out.println("Enter your number:");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("press 1 to continue and 0 to stop ");

        }
        System.out.println("Positive:"+positive);
        System.out.println("Negative:"+negative);
        System.out.println("Zeros:"+zero);

    }
}
