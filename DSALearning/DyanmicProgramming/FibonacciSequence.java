package DSALearning.DyanmicProgramming;

import java.util.Arrays;

public class FibonacciSequence {

    // O(n)
    public static int[] fibLoop(int n) {
        if (n == 0) return new int[]{};
        if (n == 1) return new int[]{0};

        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }


        return result;
    }

    // O(n^2)
    public static int[] fibRecursive(int n) {
        if (n == 0) return new int[]{};
        if (n == 1) return new int[]{0};
        if (n == 2) return new int[]{0, 1};

        int[] prevArr = fibRecursive(n - 1);
        int[] currArr = Arrays.copyOf(prevArr, n); //culprit for O (n ^ 2) on every iteration copying previous

        currArr[n - 1] = currArr[n - 2] + currArr[n - 3];

        return currArr;
    }

    // O(n) but recursive with caching
    public static int[] fibRecursivOptimised(int n) {
        int[] series = new int[n];
        fibFil(series, n - 1);
        return series;
    }

    public static void fibFil(int[] series, int index) {
        if (index == 0) series[0] = 0;
        else if (index == 1) series[1] = 1;
        else {
            fibFil(series, index - 1);
            series[index] = series[index - 1] + series[index - 2];
        }
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fibLoop(10)));
//        System.out.println(Arrays.toString(fibRecursive(10)));
        System.out.println(Arrays.toString(fibRecursivOptimised(10)));
    }
}
