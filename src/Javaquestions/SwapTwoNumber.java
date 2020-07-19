package Javaquestions;
public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping the values are ..."+a+ "  "+b);
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("After swapping the values are ..."+a+ "  "+b);
		
		// logic 1 using third variable
		
	/*	int t=a;
		a=b;
		b=t;
		System.out.println("After swapping the values are ..."+a+ "  "+b);
	*/	
		// Logic 2 use + and - operator
		
//		a=a+b; //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20
//		
//		
		// logic 3 using * & / but should not be value zero
		
//		a=a*b ;// 10*20=200
//		b=a/b; // 200/20=10
//		a=a/b; // 200/10=20
//		
//		System.out.println("After swapping the values are ..."+a+ "  "+b);
		
		
		
		int x=10;
		int y=12;
		System.out.println("Before swipping the value: " +x+"  "+y);
		
		int z=x;
		x=y;
		y=z;
		System.out.println("after swipping: " +x+" "+y);
		

	}

}
