package companyspecific.sapient;

public class Color {
	
	public static String colorCode="Black";
	private Color(String colorCode)
	{
		this.colorCode=colorCode;
	}

	public static void main(String[] args) {
		Color colourClass= new Color("White");
		System.out.println(colorCode);

	}

}
