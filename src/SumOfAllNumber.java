
public class Test {

    public static void main(String[] args) {
        String str = "1234ab56";
        int number = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}




        









