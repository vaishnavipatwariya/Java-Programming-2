package Loops;
import java.util.Scanner;
public class Rectangular12Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int r = sc.nextInt();
        System.out.print("Enter column number : ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1 ; j<=c; j++){
                if((i+j)%2==0) {
                    System.out.print(1);
                }
                    else{
                        System.out.print(2);
                    }
                }
                System.out.println();
            }
        }
    }

