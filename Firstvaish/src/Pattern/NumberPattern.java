package Pattern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            //number->print rows number , rows number times
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
