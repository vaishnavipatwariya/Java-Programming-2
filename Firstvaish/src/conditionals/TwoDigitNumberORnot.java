package conditionals;
import java.util.Scanner;
public class TwoDigitNumberORnot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.out.println("This is a two number digit");
        }
    }
}
