package sort.B;

import java.util.Random;
/**
  BubbleSort

 * Bubble Sort is a simple comparison-based sorting algorithm.
 * It works by repeatedly stepping through the list, comparing adjacent elements,
 * and swapping them if they are in the wrong order.
 *
 * The pass through the list is repeated until the list is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n)     [when the array is already sorted]
 * - Worst Case: O(n^2)  [when the array is sorted in reverse order]
 *
 * This algorithm is easy to implement but inefficient for large datasets.
 *  * This implementation also generates a random array for demonstration.
 */


public class BubbleSort {
    public static void main(String[] args) {

        //Generate random array of 15 elements
        Random random = new Random();
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("    ---Before sorting ---->");
        printArray(array);

        bubbleSort(array);
        System.out.println(" \n  ---After sorting----->");
        printArray(array);
    }
// bubble sort method
    private static void bubbleSort(int[] array) {
      boolean swapNumber = true;
      while (swapNumber){
          swapNumber =false;
          // Outer loop runs through the array n-1 times
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                swapNumber =true;
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        }

    }
//Method that prints the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
