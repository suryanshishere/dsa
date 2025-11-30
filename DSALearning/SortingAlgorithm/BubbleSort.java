package DSALearning.SortingAlgorithm;

import DSALearning.Basic.Common;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    //optimised bubblesort

    public static int[] optimisedBubbleSort(int[] arr){
        boolean isSwapped;
        for(int i = arr.length - 1; i > 0 ; i--){
            isSwapped = false;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)break;
        }
        return arr;
    }


}
