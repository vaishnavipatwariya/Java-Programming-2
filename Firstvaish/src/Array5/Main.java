package Array5;
class ArrayExample {
    void searchInArray(){
        int[] arr = {10,5,3,5,6,2,8};
        int x = 2;

        int ans = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        System.out.println("found " +x + " at index " +ans);
    }

}
//first occurance
//int []arr = {10 ,5,3,6,2,3,4};
//int x = 3;
//int ans = -1;
//for(int i = 0 ; i < arr.length; i++){
//if(arr[i]==x;
//ans = i ;
//break;
//}
public class Main{
    public static void main(String args[]){
        ArrayExample obj = new ArrayExample();
        obj.searchInArray();
    }
}

