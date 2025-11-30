package DSALearning.SortingAlgorithm;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValIndex] > arr[j]) {
                    minValIndex = j;
                }
            }
            if (minValIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minValIndex];
                arr[minValIndex] = temp;
            }
        }

//        From backside
//        for(int i = arr.length - 1; i >= 0; i--){
//            int minValIndex = i;
//            for(int j = i - 1; j >= 0; j--){
//                if(arr[minValIndex] < arr[j]){
//                    minValIndex = j;
//                }
//            }
//            if (minValIndex != i) {
//                int temp = arr[i];
//                arr[i] = arr[minValIndex];
//                arr[minValIndex] = temp;
//            }
//        }

        return arr;
    }
}
