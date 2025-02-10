//******
//******
//******
package ProblemsOnLoops;
import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for (int i = 1 ; i <= 3 ; i++){
            for(int j = 1 ; j <= 6; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
