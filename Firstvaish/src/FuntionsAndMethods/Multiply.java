package FuntionsAndMethods;

import java.util.Scanner;

public class Multiply {
    public static int calculateProduct(int a,int b){
        return  a * b;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b =Sc.nextInt();
        System.out.println("The product of two numbers is:" +calculateProduct(a,b));
    }
}
