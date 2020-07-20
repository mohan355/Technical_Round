package Javaquestions;
public class countNumberOfDigits {

	public static void main(String[] args) {
		
	/*	int num=23561789;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("total number of digit is :" +count);
		
		*/
		
		int num=2367941;
		int even=0;
		int odd=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}

		num=num/10;
				
			
		}
		System.out.println(even);
		System.out.println(odd);
		//My name is mohan
		//i am a tester
		// i live in baltimore
	}
	

		
}
