/*
This file creates a class that runs bubble sort in java
*/
public class BubbleSort {

    static int[] sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] arr = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        arr = sort(arr);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
