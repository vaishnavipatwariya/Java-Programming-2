package FuntionsAndMethods;

import java.util.Scanner;
public class SumOfNumber{
    public static int calculateSum(int a, int b){
        int Sum = a+b;
        return Sum;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int Sum = calculateSum(a,b);
        System.out.println("The sum of two numbers a and b is:" + Sum);

    }

}

