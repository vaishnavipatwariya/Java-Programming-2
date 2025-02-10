
//HW check kr lena
package conditionals;
import java.util.Scanner;
public class InsideOrOutsideOrOnTheCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=100 ,y=50;
        int radius=5;
        System.out.println("Enter x1 coordinate :");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 coordinate :");
        int y1 = sc.nextInt();
        int OA = (((100-x1)^2)+((50-y1)^2))^(1/2);

        if(OA>radius){
            System.out.println("THe point lies outside the circle ");
        }
        else if (OA<radius){
            System.out.println("The point lies inside the circle ");
        }
        else if(OA==radius){
            System.out.println("The point lies on the circle");
        }
        else{
            System.out.println("none");
        }
    }
}
