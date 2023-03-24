package sorting;

import java.util.Arrays;

public class QuickSort {

    /**
     *
     * @param arr
     * @param low
     * @param high
     * @return partition
     * This function takes last element as pivot,places the pivot element at its correct
     * position in sorted array, and places all smaller (smaller than pivot) to left of
     * pivot and all greater elements to right of pivot
     */
    int partition(int[] arr, int low, int high){
       int pivot = arr[high];
       int i = low-1;

       for(int j=low; j<high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }

    /**
     *
     * @param arr
     * @param low
     * @param high
     * The main function that implements QuickSort
     */
    public void sort(int[] arr, int low, int high) {
        if(low < high) {
            int part = partition(arr, low, high);

            sort(arr, low, part-1);
            sort(arr, part+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
