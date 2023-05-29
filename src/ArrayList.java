import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
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
