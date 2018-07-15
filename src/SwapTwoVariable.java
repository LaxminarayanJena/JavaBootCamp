
public class SwapTwoVariable {

	public static void main(String[] args) {
		//With third variable
		
		int x=5;
		int y=10;
		//x=10,y=5;
		
		int t;
		
		t=x; //5
		x=y;//10
		y=t;//5
		System.out.println("value of x-" +x);
		System.out.println("value of y-" +y);
		
		//Without third variable
		int p=4;
		int q=5;
		p=p+q; //15
		q=p-q;//5
		p=p-q;//10
		System.out.println("value of p-" +p);
		System.out.println("value of q-" +q);
		
			
		//using *
		int a=8;
		int b=9;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("value of a-" +a);
		System.out.println("value of b-" +b);
		
		//using XOR
		int c=5;
		int d=10;
		c=c^d;//15->1111
		d=c^d;//10->1010
		c=c^d;//5->0101
		
		
		System.out.println("value of c-" +c);
		System.out.println("value of d-" +d);

	}

}
