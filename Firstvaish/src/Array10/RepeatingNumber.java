package Array10;

import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {//First number
            for (int j = i + 1; j < n; j++) {//Second number
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First Repeating Number : " + firstRepeatingNumber(arr));
    }
}