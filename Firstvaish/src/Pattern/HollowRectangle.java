package Pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        //work of rows-outer loops
        //work of columns-inner loops
        int n = 4;
        int m = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //Cell->(i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                    System.out.println();
            }
        }

}
