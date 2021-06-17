package programming.basics;

import static programming.basics.ArrayUtils.print;

public class ArrayOperations {

    private static int[] arr = {3, 4, 6, 8, 2, 9};

    /**
     * @param position Position to insert at.
     * @param item     Element to insert. <p>
     *                 To insert at specific position start from the end
     *                 and traverse up to position-1. During traversal keep
     *                 shifting the elements to right. Insert the number at index position-1.
     *                 Also copy the remaining elements to the same position in the resultant array.</p>
     */
    static void insertAtPosition(int position, int item) {
        if (position < 1 || position > arr.length + 1) {
            throw new IllegalArgumentException("Invalid position");
        }
        int[] result = new int[arr.length + 1];
        for (int index = arr.length - 1; index >= position - 1; index--) {
            result[index + 1] = arr[index];
        }
        result[position - 1] = item;
        for (int index = position - 2; index >= 0; index--)
            result[index] = arr[index];
        print(result);
    }

    /**
     * @param position Position to delete element. <p>
     *                 Traverse from start up to position-2 and copy to resultant array
     *                 Then traverse from position-1 up to end shift the next element to
     *                 current position .</p>
     */
    static void deleteAtPosition(int position) {
        int[] result = new int[arr.length - 1];
        if (position < 1 || position > arr.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int beforeIndex = 0; beforeIndex < position - 1; beforeIndex++) {
            result[beforeIndex] = arr[beforeIndex];
        }
        for (int afterIndex = position - 1; afterIndex <= arr.length - 2; afterIndex++) {
            result[afterIndex] = arr[afterIndex + 1];
        }
        print(result);
    }

    public static void main(String[] args) {
        print(arr);
        deleteAtPosition(7);
    }
}
