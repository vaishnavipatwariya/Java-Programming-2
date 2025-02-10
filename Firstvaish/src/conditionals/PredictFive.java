package conditionals;

public class PredictFive {
    public static void main(String[] args) {
        int x = 3, y;
        y = x = 10;
        boolean z = x < 10;
        System.out.println(" x=" +x+ " y=" +y+ " z=" +z);
        System.out.println(x==3);
        System.out.println(x<10);
    }
}
//give error if
//int x = 3 , y ,z ;
//y = x = 10;
//z = x < 10;
//System.out.println(" x=" +x+ " y=" +y+ " z=" +z);