package ProblemsOnLoops;
import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number :");
      int n = sc.nextInt();
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
