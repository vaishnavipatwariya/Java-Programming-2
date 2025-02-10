//homework
//Find the number of sum of the following series s = 1 -2 + 3 -4.....n
//if n = 5 then s = 1 -2 + 3 -4 + 5 = 3 ans
package ProblemsOnLoops;
import java.util.Scanner ;
public class SumSeries {
    public static void main(String[] args){
        System.out.print("Enter n" +
                " : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(" -"+i );
            }
            else{
                System.out.print(" "+i);
            }
        }

        for(int i = 1; i<=n; i++){
            if(i %2 == 0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }
        System.out.println();
        System.out.print(" "+ans);

    }
}
