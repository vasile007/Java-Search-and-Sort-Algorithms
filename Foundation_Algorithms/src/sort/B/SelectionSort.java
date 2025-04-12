package sort.B;

import java.util.Random;

/**
 * SelectionSort
 *
 * Selection Sort divides the array into a sorted and an unsorted part.
 * It repeatedly selects the minimum (or maximum) element from the unsorted part
 * and moves it to the end of the sorted part.
 *
 * Time Complexity:
 * - Best & Worst Case: O(n^2)
 *
 * Not stable, and generally slower than other algorithms.
 *  * This implementation also generates a random array for demonstration.
 */



public class SelectionSort {
    public static void main(String[] args) {
        //Generate random array of 15 elements
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("    ---Before sorting ---->");
        printArray(array);

        selectionSort(array);
        System.out.println(" \n  ---After sorting----->");
        printArray(array);
    }
// selection sort method
    private static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int  minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
                swapNumbers(array,i,minIndex);

        }
    }
// method for swapping the numbers
    private static void swapNumbers(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
    //Method that prints the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

