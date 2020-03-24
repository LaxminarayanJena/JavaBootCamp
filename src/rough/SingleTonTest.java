 package rough;

public class SingleTonTest {

	public static void main(String[] args) {
		
		SingleTon obj1= SingleTon.getInstance();
		SingleTon obj2= SingleTon.getInstance();

		System.out.println(obj1==obj2);

			}
}
