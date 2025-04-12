package sort.B;

import java.util.Random;


/**
 * InsertionSort
 *
 * Insertion Sort builds the final sorted array one element at a time.
 * It takes each element and inserts it into its correct position in the sorted part.
 *
 * Time Complexity:
 * - Best Case: O(n)
 * - Worst Case: O(n^2)
 *
 * Efficient for small datasets and nearly sorted arrays.
 *  * This implementation also generates a random array for demonstration.
 */

public class InsertSort {
    public static void main(String[] args) {
        //Generate random array of 15 elements
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("    ---Before sorting ---->");
        printArray(array);

        insertSort(array);
        System.out.println(" \n  ---After sorting----->");
        printArray(array);
    }
// insert sort method
    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }
    //Method that prints the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

