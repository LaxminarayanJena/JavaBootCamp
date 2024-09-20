package core;

import java.util.Arrays;

public class CheckNoisPresntAndAddToArray {

    public static void main(String args[]) {
        int a[] = {1, 2, 2, 3, 74, 89, 98, 100};

        int no = 50;  // The number to check and insert if not present
        boolean found = false;

        // Traverse the array to check if the number is present
        for (int i = 0; i < a.length; i++) {
            if (a[i] == no) {
                found = true;  // Set to true if the number is found
                break;         // Exit the loop once found
            }
        }

        // If the number is not present, insert it into the array
        if (!found) {
            // Create a new array with one extra element
            int newArray[] = new int[a.length + 1];

            // Copy elements from the original array
            for (int i = 0; i < a.length; i++) {
                newArray[i] = a[i];
            }

            // Add the new number at the end
            newArray[a.length] = no;

            // Sort the new array (optional, based on your needs)
            Arrays.sort(newArray);

            System.out.println("Number was not present, so it was added.");
            System.out.println("New array: " + Arrays.toString(newArray));
        } else {
            System.out.println("Number is already present.");
        }
    }
}
