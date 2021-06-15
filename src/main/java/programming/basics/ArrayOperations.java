package programming.basics;

public class ArrayOperations {

    private static int[] arr = {3,4,6,8,2,9};

    static void print(int[] arr) {
        System.out.print("[");
        for (int index=0; index <= arr.length-1; index++) {
            if(index < arr.length-1)
                System.out.print(arr[index] + ", ");
            else
                System.out.print(arr[index]);
        }
        System.out.println("]");
    }

    /**
     * To insert at specific position start from the end
     * and traverse up to position-1. During traversal keep
     * shifting the elements to right. Insert the number at index position-1.
     * Also copy the remaining elements to the same position in the resultant array.
     */
    static void insertAtPosition(int position, int item) {
        int[] result = new int[arr.length+1];
       for (int index= arr.length-1; index >= position-1; index--) {
           result[index+1] = arr[index];
       }
       result[position-1] = item;
       for (int index=position-2; index>=0;index--)
           result[index] = arr[index];
       print(result);
    }

    public static void main(String[] args) {
        print(arr);
        insertAtPosition(4,5);
    }
}
