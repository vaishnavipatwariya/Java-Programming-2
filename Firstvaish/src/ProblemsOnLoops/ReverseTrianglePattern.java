//**** 5-1  r+1-i
//***  5-2
//**   5-3
//*    5-4


package ProblemsOnLoops;
import java.util.Scanner;
public class ReverseTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int r = sc.nextInt();

        for (int i = r ; i >= 1 ; i--){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 1 ; i <= r ; i++){
//            for(int j = 1 ; j <= (r+1-i) ; j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
