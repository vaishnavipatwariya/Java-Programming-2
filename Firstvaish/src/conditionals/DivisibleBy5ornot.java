package conditionals;
import java.util.Scanner;
public class DivisibleBy5ornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The number you entered is divisible by 5");

        }
        else{
            System.out.println("The number you entered is  NOT divisible by 5 ");
        }
    }
}
