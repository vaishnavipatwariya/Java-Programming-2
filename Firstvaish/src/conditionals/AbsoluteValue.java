package conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n<0) {
            n = n * (-1);
        }
        System.out.println("The absolute value is:"+n);

    }
}
