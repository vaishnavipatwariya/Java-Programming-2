package Array9;

public class MiscProblem2 {
    static void swapWithoutTemp(int a , int b){
      System.out.println("Original value before swap");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

    a = a + b;// 12
    b = a - b; // b = 9
    a = a - b; // a = 3

        System.out.println("Value after swap");
        System.out.println("a :" + a);
        System.out.println("b :" + b);

    //a = 3 , b = 9
}

public static void main(String[] args) {
    int a = 9;
    int b = 3;
    int[] arr = {1, 2, 3, 4, 5};
    swapWithoutTemp(a, b);
  }
}



