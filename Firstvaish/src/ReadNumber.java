import java.util.Scanner;

public class ReadNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(5);
        System.out.println("Character is :"+ch);

    }
}
