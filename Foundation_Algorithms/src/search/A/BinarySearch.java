package search.A;


/**
 * BinarySearch
 *
 * Binary Search is an efficient algorithm for finding a target value
 * within a sorted array. It repeatedly divides the search interval in half.
 *
 * Time Complexity:
 * - Best Case: O(1)
 * - Worst Case: O(log n)
 *
 * Works on: Sorted arrays only.
 */

public class BinarySearch {
    public static void main(String[] args) {


        int [] array = new int[250];
        int target = 67;
        for (int i = 0; i < array.length; i++) {
            array[i] =i;
        }
        int index = binarySearch(array,target);
        if (index != -1){
            System.out.println(" The target is: " + target);
        }else {
            System.out.println(" Target not found");
        }

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int middleValue = (low + high) /2;
            int value = array[middleValue];

            System.out.println(" The middle value is: " + value);
            if (value < target) low = middleValue + 1;
            else if (value > target)high = middleValue -1;
            else return middleValue;
        }
        return -1;
    }
}
