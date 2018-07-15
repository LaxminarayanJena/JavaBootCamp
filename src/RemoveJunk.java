
public class RemoveJunk {

	public static void main(String[] args) {
		String s="$%^&t5tt7$qa!@";
		//Regular Expression :[^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
