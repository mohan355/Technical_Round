package Javaquestions;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("user input:");
		
//		String value=sc.nextLine();
//		System.out.println(value);
		
		int num=sc.nextInt();
		
		int Rev=0;
		
		while(num!=0) {
			Rev=Rev*10 + num%10;
			num=num /10;
		}
		
		System.out.println(Rev);
		
		
		
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("user input:");
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer Res=sb.reverse();
		System.out.println("The reverse number is:" +Res);
	*/
		
	
		Scanner scr=new Scanner(System.in);
		System.out.println("input");
		int numm=scr.nextInt();
		
		StringBuilder bld=new StringBuilder();
		bld.append(numm);
		StringBuilder Revv = bld.reverse();
		System.out.println("The reverse number is :" +Revv );
		
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter input from user");
		int nummm=scn.nextInt();
		
		StringBuffer bfr=new StringBuffer(String.valueOf(nummm));
		StringBuffer rsv=bfr.reverse();
		System.out.println("The Reverse number is " +rsv);
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("user input:");
		int num=sc.nextInt();

		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder Rev=sbl.reverse();
		System.out.println("The reverse number is: " +Rev);
		*/

	} 
}
