package sort.B;

import java.util.Random;

/**
 * MergeSort
 *
 * Merge Sort is a divide-and-conquer algorithm that splits the array into halves,
 * recursively sorts each half, and then merges the sorted halves.
 *
 * Time Complexity:
 * - Best, Average, and Worst Case: O(n log n)
 *
 * Requires extra space for merging. Very efficient and stable.
 *  * This implementation also generates a random array for demonstration.
 */



public class MergeSort {
    public static void main(String[] args) {
        //Generate random array of 15 elements
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("    ---Before sorting ---->");
        printArray(array);

        mergeSort(array);
        System.out.println(" \n  ---After sorting----->");
        printArray(array);
    }
//merge sort method
    private static void mergeSort(int[] array) {

        int length = array.length;
      if (length < 2) {
          return;
      }
      int middleIndex = length /2;
      int [] leftHalf = new int[middleIndex];
      int [] rightHalf =  new int[ length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = middleIndex; i <  length; i++) {
            rightHalf[i - middleIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array,leftHalf,rightHalf);
    }

    /*
    i, j, and k are pointers for leftHalf, rightHalf, and the result array (array), respectively.
It compares elements from the left and right halves.
It puts the smaller one into the result array (array[k]), and moves the pointers.
When one of the halves is exhausted, it just copies the rest of the remaining half (if any) into the result.
     */

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i =0, j =0, k =0;

        while ( i < leftSize &&  j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    //Method that prints the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

