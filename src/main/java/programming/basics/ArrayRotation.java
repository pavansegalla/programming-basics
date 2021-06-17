package programming.basics;

import static programming.basics.ArrayUtils.print;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class ArrayRotation {
    static int[] arr = {1,2,3,4,5,6};
    static final int d = 6;
    static final int n =6;

    public static void main(String[] args) {
        rotate(arr, d, n);
        print(arr);
    }

    private static void rotate(int[] arr, int d, int n) {
        for (int index=0; index < d; index++)
             rotateLeft(arr);
    }

    private static void rotateLeft(int[] arr) {
        int temp = arr[0];
        for (int index=0; index <=n-2; index++) {
            arr[index] = arr[index+1];
        }
        arr[n-1] = temp;
    }


}
