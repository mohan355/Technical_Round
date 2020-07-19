package Javaquestions;

public class Prime_Number {
	
	public static boolean isprimeNumber(int num) {
		
		if(num<=1) {
			return false;
			}
		
		for(int i=2;i<num;i++) {
			
			if (num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
 public static void getPrimeNumber(int num) {
	 
	 for(int i=2;i<num;i++) {
		 if (isprimeNumber(i)) {
			 System.out.print(i +" ");
		 }
			 
	 }
	 
 }
	public static void main(String[] args) {
		
		System.out.println("Is 7 prime  a number: "+ isprimeNumber(7));
		getPrimeNumber(12);
	
		

	}

}
