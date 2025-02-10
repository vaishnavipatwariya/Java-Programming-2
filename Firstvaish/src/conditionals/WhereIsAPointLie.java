//Given a point (x,y), write a program to find out if it lies on the x-axis, y-axis or at the origin

package conditionals;
import java.util.Scanner;
public class WhereIsAPointLie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate : ");
        int x = sc.nextInt();
        System.out.println("Enter y coordinate : ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("The point is origin ");
        }
        else if(x==0){
            System.out.println("The point lies on y-axis");
        }
        else if(y==0){
            System.out.println("The point lies on x-axis");
        }
        else{
            System.out.println("The point neither lies on x-axis nor y-axis ");
        }
    }
}
