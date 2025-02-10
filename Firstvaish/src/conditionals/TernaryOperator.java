package conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int num = sc.nextInt();

        String ans;
        ans =  (num % 2 == 0)? "Even" : "Odd";
        System.out.println(ans);
    }
}
