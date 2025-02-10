package Arrays;

 class ArrayExample {
     void demoArrays(){
          int[] ages = new int[3];
          //or int[] ages = {10,20,30};

          float[] weights = new float[3];
          String[] names = new String[3];
          //or String[] names = {"raj" , "rahul","rani"};


         // System.out.println(ages.lenght);//3
         // System.out.println(weights.lenght);//3
         // System.out.println(String.lenght);//3

          ages[0] = 34;
          ages[1] = 21;
          ages[2] = 15;
          //weights[0] = 23.4f

          System.out.println(ages[0]);
          System.out.println(ages[1]);
          System.out.println(ages[2]);
          System.out.println();

          for(int i=0 ; i<3 ; i++){
               //0r for(int i=0 ; i<arr.length; i++){
               System.out.println(ages[i]);

          }
          System.out.println();
          //print full array , for each loop
          for(int age : ages){
               System.out.println(age);
          }

          //by while loop
          System.out.println();
          int i = 0;
          while(i<3){
               System.out.println(ages[i]);
               i++;
          }


     }
     void multiArray(){
          //int[][] arr = new int [3][3];
          int [][] arr = {{56,43,6},{34,7,8},{12,56,18}};

          System.out.println();

          System.out.println(arr[0][0]);
          System.out.println(arr[0][1]);
          System.out.println(arr[0][2]);

          System.out.println(arr[1][0]);
          System.out.println(arr[1][1]);
          System.out.println(arr[1][2]);

          System.out.println(arr[2][0]);
          System.out.println(arr[2][1]);
          System.out.println((arr[2][2]));

          System.out.println();

       

      }
}
public class Main{
     public static void main(String[] args){
          ArrayExample obj = new ArrayExample();
          obj.demoArrays();
          obj.multiArray();

     }

}
