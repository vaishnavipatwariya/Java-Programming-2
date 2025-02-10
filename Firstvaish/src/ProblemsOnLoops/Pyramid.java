//   *        space = 3 = (4-1)= (r-1)    stars = 1 = 2*r-1
//  * *       space = 2 = (4-2)= (r-2)    stars = 2 = 2*r-1
// * * *      space = 1 = (4-3)= (r-3)    stars = 3 = 2*r-1
//* * * *     space = 4 = (4-4)= (r-4)    stars = 4 = 2*r-1



package ProblemsOnLoops;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++ ){//traversing over rows

            //print r - 1 spaces
            for(int j = 1 ; j <= r-i; j++){
                System.out.println(" ");
            }

            //print 2 * i - 1 stars
                for(int k = 1; k <= 2*i-1 ; k++){
                    System.out.println("*");
                }

            System.out.println(" ");

        }
    }
}
