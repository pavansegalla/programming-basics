package programming.basics;

public class GCD {

    static int n = 30;
    static int m = 45;

    public static void main(String[] args) {
        int smallest = n > m ? m : n;
        int largest = n > m ? n : m;
        for (int index = smallest; index > 0; index--) {
            if (smallest % index == 0) {
                if (largest % index == 0) {
                    System.out.println("GCD is " + index);
                    return;
                }
            }
        }
    }
}
