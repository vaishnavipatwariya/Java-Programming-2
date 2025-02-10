package Array10;

import java.util.Scanner;

public class Question4 {

    static boolean isSorted(int[] arr) {
        // 1 5 6 7 sorted
        //1 5 5 5 7 8 sorted
        //5 7 8 3 9 1 not sorted
        boolean check = true;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }
    static int lastOccurrence(int[] arr, int x) {
    int lastIndex = -1;
    for (int i = 0; i < arr.length; i++) {
        /*
        i = 0
        arr[0] < arr[-1]

         */
        if (arr[i] == x) {
            lastIndex = i;
        }
    }
    return lastIndex;
}
    static int countOccurrence(int[] arr, int x){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter x");
//        int x = sc.nextInt();

        // System.out.println("COUNT OF X:" +countOccurrence( arr , x));
       // System.out.println("LAST OCCURRENCE OF X : " +lastOccurrence(arr, x));
        System.out.println(" Is Sorted " +isSorted(arr));
    }
}




