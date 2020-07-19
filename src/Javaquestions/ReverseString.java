package Javaquestions;
public class ReverseString {

	public static void main(String[] args) {
		
		String str= "mohan";
	//	String Rev= " ";
		StringBuffer sbf=new StringBuffer(str);
		StringBuffer R=	sbf.reverse();
		System.out.println(R);
		
	/*	int len= str.length();
		
		for (int i=len-1;i>=0;i--) {
			
			Rev=Rev+str.charAt(i);
		}
		System.out.println("The Reverse string is :"+Rev);
		
      // by using charecter array
		
		char a[]=str.toCharArray();
		int lenn=a.length;
		
		for( int i=lenn-1;i>=0;i--) {
			Rev=Rev+a[i];
			
		}
		System.out.println("reverse value is:" +Rev);
	*/	
		}

}
