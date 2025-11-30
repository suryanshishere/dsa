package DSALearning.Basic;

public class Common {

    public static void printArray(String s, int[] arr) {
        System.out.println(s);
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String s, Iterable<?> arr) {
        System.out.println(s);
        for (Object value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(String s, T[] arr) {
        System.out.println(s);
        for (T value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}