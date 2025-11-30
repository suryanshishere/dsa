package DSALearning.SortingAlgorithm;

import java.util.Arrays;

public class SortingAlgorithmMain {
    public static void main(String[] args){
        int[] arr = new int[]{4, 2, 6, 5, 1, 3};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
//        BubbleSort.bubbleSort(arr);
//        SelectionSort.selectionSort(arr);
        InsertionSort.insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
