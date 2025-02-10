package Array3;

 class ArrayExample2 {
     void sumOfArray() {
         int[] arr = {1, 2, 6, 7, 0};
         int sum = 0;

         for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i];

         }
         System.out.println(sum);
     }
 }
public class Main{
    public static void main(String args[]){
        ArrayExample2 obj = new ArrayExample2();
        obj.sumOfArray();
    }
}