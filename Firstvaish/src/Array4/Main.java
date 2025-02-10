package Array4;

class ArraysExample {
    void maxOfArray(){
    int[] arr = {5,6,73,5,87,34,24,2};
    int ans = 0;

    for(int i = 0 ; i < arr.length ; i++){
    if(arr[i] > ans){
    ans = arr[i];
    }
    }
        System.out.println("Max : " +ans);
    }
}
public class Main{
    public static void main(String []args){
        ArraysExample obj = new ArraysExample();
        obj.maxOfArray();
    }
}