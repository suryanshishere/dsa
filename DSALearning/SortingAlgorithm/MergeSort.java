package DSALearning.SortingAlgorithm;


import java.util.Arrays;

public class MergeSort {
    private static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int[] mergeArr = new int[arr1.length + arr2.length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArr[k] = arr1[i++];
            } else {
                mergeArr[k] = arr2[j++];
            }
            k++;
        }

        while (i < arr1.length) {
            mergeArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergeArr[k++] = arr2[j++];
        }

        return mergeArr;
    }

//    private static int[] copyOfRange(int[] arr, int startIndex, int endIndex) {
//        int[] resultArr = new int[endIndex - startIndex];
//
//        int j = 0;
//        for (int i = startIndex; i < endIndex; i++) {
//            resultArr[j++] = arr[i];
//        }
//
//        return resultArr;
//    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int midIndex = arr.length / 2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));

        return merge(leftArr, rightArr);
    }
}
