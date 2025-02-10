package Sorting;

import java.util.Scanner;

public class selectionSort {
    static void selectionSorting(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n-2; i++){ // i represent the current index

            //Find the minimum element in unsorted part of  array
            int min_index = i;

            for (int j = i+1 ; j < n ; j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //swap current element and minimum element -> current index i will have correct element
            // a[min_index] , a[i]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {7 , 4 , 5, 1 ,2};
        selectionSorting(arr);
        for (int i : arr){
            System.out.print(i+ " ");
        }

    }
}
