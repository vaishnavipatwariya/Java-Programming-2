package FuntionsAndMethods;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int a = 0, b = 1 ;
        System.out.println(a+" ");
         if(n>1)
             //find nth term
             for(int i = 2 ; i<=n ; i++){
                 //the concept below is called swapping
                 int temp = b;
                 b= a + b ;
                 a = temp;

             }
        System.out.println();
    }
}
