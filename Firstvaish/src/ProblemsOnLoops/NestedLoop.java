package ProblemsOnLoops;
import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for( int i = 1 ; i <= 3 ; i++ ){
            for (int j = 1 ; j <= 3 ; j++) {
                System.out.println(i + "," + j);
            }
            System.out.println();
        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
