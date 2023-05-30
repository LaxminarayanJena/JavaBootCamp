import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter number");
		String str = myObj.nextLine(); 
		int a = Integer.parseInt(str);
		
		numbers.add(a);
		numbers.add(20);
		numbers.add(30);

		numbers.set(1, 19);
		numbers.remove(2);
		System.out.println("Number of integers: " + numbers.size());

		for (Integer no : numbers) {
			System.out.println(no);
		}

		// shift position
		System.out.println("Initial ArrayList: " + numbers);
		for (int i = 0; i < 5; i++) {
			numbers.add(i + 1, numbers.get(i) + 10);
		}
		System.out.println("Updated ArrayList: " + numbers);
	}

}
