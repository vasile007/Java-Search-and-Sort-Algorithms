package search.A;
/**
 * LinearSearch
 *
 * Linear Search is a simple searching algorithm that checks each element
 * of the array one by one until the target value is found or the end is reached.
 *
 * Time Complexity:
 * - Best Case: O(1)
 * - Worst Case: O(n)
 *
 * Works on: Unsorted or sorted arrays.
 */



public class LinearSearch {
    public static void main(String[] args) {


        int [] array = {22,4,7,89,12,33,20,10,3};
        int index = linearSearch(array,12);


        if (index != -1){
            System.out.println("  The index is: " + index);


        }else {
            System.out.println(" The index doesn't exist");
        }
    }

    private static int linearSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;

            }

        }
        return -1;

    }

}
