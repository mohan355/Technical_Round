package Javaquestions;

public class Fibanocci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum=0;
		int i=1;
		
		while(i<12) {
			sum=a+b;
			a=b;
			b=sum;
			i++;
			System.out.println(sum);
		}

	}

}
