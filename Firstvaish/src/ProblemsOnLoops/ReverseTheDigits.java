package ProblemsOnLoops;
import java.util.Scanner;
public class ReverseTheDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int n = sc.nextInt();

        int ans = 0;

        while(n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(" The reverse of entered digits  = : " +ans);
    }
}
