package sort.B;

import java.util.Random;
/**
 * QuickSort
 *
 * Quick Sort is a divide-and-conquer algorithm that picks a pivot,
 * partitions the array around the pivot, and recursively sorts the subarrays.
 *
 * Time Complexity:
 * - Best & Average Case: O(n log n)
 * - Worst Case: O(n^2) [when pivot is poorly chosen]
 *
 * Fast and efficient for large datasets, but not stable.
 *  * This implementation also generates a random array for demonstration.
 */




public class Quicksort {
    public static void main(String[] args) {

        //Generate random array of 15 elements

    Random random = new Random();
    int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
    }
        System.out.println("    ---Before sorting ---->");
    printArray(array);

    quickSort(array , 0 , array.length -1);
        System.out.println(" \n  ---After sorting----->");
    printArray(array);
}
//quick sort method
    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

          while (array[leftPointer] <= pivot && leftPointer < rightPointer){
              leftPointer++;
          }
          while (array[rightPointer] >= pivot && leftPointer < rightPointer){
              rightPointer--;
          }
           swapNumbers(array,leftPointer,rightPointer);
        }
        swapNumbers(array,leftPointer ,highIndex);

        quickSort(array,lowIndex, leftPointer -1);
        quickSort(array,leftPointer +1 , highIndex);

    }
// the swapping method
    private static void swapNumbers(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    //Method that prints the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
