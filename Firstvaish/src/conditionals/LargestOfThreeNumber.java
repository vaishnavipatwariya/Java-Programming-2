package conditionals;
import java.util.Scanner;
public class LargestOfThreeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a :");
        int a = sc.nextInt();
        System.out.println("Enter second number b :");
        int b =sc.nextInt();
        System.out.println("Enter third number c :");
        int c = sc.nextInt();
        if (a<b  &&  a>c){
            System.out.println("a is greater , "+a);
        }
        else if (b>a  &&  b>c){
            System.out.println("b is greater , "+b);
        }
        else{
            System.out.println("c is greater , "+c);
        }
    }
}
