package conditionals;

import java.util.Scanner;

public class DivisiblleByThreeOrFive {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
        System.out.println("The number is divisible by 3 or 5  ");

        }
        else
        {
            System.out.println("not divisible by either 3 or 5");
        }
                }
                }