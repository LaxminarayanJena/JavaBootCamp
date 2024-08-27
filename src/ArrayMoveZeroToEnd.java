import java.util.Arrays;

public class ArrayMoveZeroToEnd {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};

        int n = a.length;
        int j = 0; // Index for placing non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        // Fill remaining positions with zeros
        while (j < n) {
            a[j] = 0;
            j++;
        }

        // Print the modified array
        System.out.println(Arrays.toString(a));
    }
}
