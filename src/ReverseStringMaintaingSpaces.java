public class Main {
    public static void main(String[] args) {
        String str = "My name is rana";  // The input string
        
      output- "an arsi em anyM"

        char[] result = new char[str.length()];  // An array to store the result, which will be the rearranged string.

        // 'i' is used to iterate over the original string, and 'j' is used to iterate from the end of the string towards the beginning.
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            
            // If the character at position 'i' is a space, we just copy it as it is in the result.
            if (str.charAt(i) == ' ') {
                result[i] = ' ';
                j++;  // Adjust 'j' to skip the space when copying from the end.
            } else {
                // If 'str.charAt(j)' is a space, we skip it and move 'j' backward until we find a non-space character.
                while (str.charAt(j) == ' ') {
                    j--;
                }
                result[i] = str.charAt(j);  // Copy the character from the end to the correct position in 'result'.
            }
        }

        // Convert the 'result' character array into a string and print it.
        System.out.println(new String(result));
    }
}
