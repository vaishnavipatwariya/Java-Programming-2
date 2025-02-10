package Sorting;
public class bubbleSort {

    static void bubbleSorting(int[] arr){
        int n = arr.length;

        //n-1 iteration/passes
        for (int i = 0; i < n-1 ; i++){
            for(int j = 0; j < n-i-1 ; j++){
                /*
                last i elements are already at correct sorted positions,
                so n0 need to check them
                 */
                if (arr[j] > arr[j+1]){
                    //swap :- a[j] , a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //
    }

    public static void main(String[] args){
        int[] arr = {7 , 6 ,5 , 4 ,3};
        bubbleSorting(arr);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
}
