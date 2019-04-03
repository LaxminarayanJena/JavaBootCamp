package rough;

public class CharCount {
	
	public static void main(String[] args) {
		
		
		String str= "LaxminarayanJena";
		int count=0;
		
		for(char i='a'; i<='z';i++)
				{
			for(int j=0;j<str.length()-1;j++)
			{
				if(str.charAt(j)==i)
				{
					count++;
				}
					
			}
			if(count!=0)
			{
				System.out.println(i +"-"+ count);
				count=0;
			}
				}
	}

}
