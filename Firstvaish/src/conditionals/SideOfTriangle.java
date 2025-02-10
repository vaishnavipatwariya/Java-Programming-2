package conditionals;
import java.util.Scanner;
public class SideOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  First side : ");
        int a = sc.nextInt();

        System.out.println("Enter Second side : ");
        int b = sc.nextInt();

        System.out.println("Enter thir side : ");
        int c = sc.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a){
         System.out.println("Entered  sides are sides of a triangle or Valid triangle ");

        }
        else{
            System.out.println("Entered sides are not sides of a triangle  or Invalid triangle ");

        }

    }
}
