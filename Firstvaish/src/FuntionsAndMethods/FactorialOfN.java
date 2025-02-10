package FuntionsAndMethods;
import java.util.Scanner;
public class FactorialOfN {

        public static void printFactorial(int n){
            if(n<0) {
                System.out.println("invalid number ");
                return ;
            }
            int Factorial = 1;

            for (int i=n ; i>=1 ; i--){
                Factorial = Factorial*i;
            }
            System.out.println(Factorial);
            return ;
        }
        public static void main(String[] args){
            Scanner Sc = new Scanner(System.in);
            int n = Sc.nextInt();

            printFactorial(n);

        }
    }

