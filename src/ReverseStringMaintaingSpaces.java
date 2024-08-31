public class ReverseStringMaintaingSpaces {

//Output-"an jesi em anyaM"
    
public static void main(String[] args) {
        String str = "My name is jena";

        // Reverse the entire string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Split the reversed string into parts
        String[] parts = reversedStr.split(" ");

        // Swap the first and last parts
        String temp = parts[0];
        parts[0] = parts[parts.length - 1];
        parts[parts.length - 1] = temp;

        // Join them back into a single string
        String result = String.join(" ", parts);

        System.out.println(result);
    }
}
