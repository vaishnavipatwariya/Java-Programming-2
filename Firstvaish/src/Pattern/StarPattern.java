package Pattern;

public class StarPattern {
    public static void main(String[] args) {
        //outer loop
        for (int i = 1; i <= 4; i++) {
           //inner loop
            for (int j = 1;j <= 5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//int n = 4;
//int m= 5;
//for(int i=n;i<=n;i++){
//    for(int  j=m;j<=5;j++){
//        System.out.print("*");
//    }
//    System.out.println();
//        }

