package conditionals;
import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter selling price:");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("You made profit");
            System.out.println("your profit is: " + (sp - cp));
        }
        else if (sp==cp){
            System.out.println("neither gain profit nor loss");

        }
        else
            {
            System.out.println("You incurred a loss ");
            System.out.println("Your loss is: " + (cp - sp));
        }
    }


}