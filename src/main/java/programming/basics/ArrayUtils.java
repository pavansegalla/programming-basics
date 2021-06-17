package programming.basics;

public class ArrayUtils {

    static void print(int[] arr) {
        System.out.print("[");
        for (int index = 0; index <= arr.length - 1; index++) {
            if (index < arr.length - 1)
                System.out.print(arr[index] + ", ");
            else
                System.out.print(arr[index]);
        }
        System.out.println("]");
    }
}
