
import java.util.Scanner;
public class TakingInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

          System.out.println("Enter your name");
    String name = sc.next();
          System.out.println("Name is :"+name);

          System.out.print("Enter your lucky number:");
    int num_1 = sc.nextInt();

          System.out.println("Lucky number is :"+num_1);
}
}

