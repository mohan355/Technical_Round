package Javaquestions;

import java.util.Scanner;

public class ComparingNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a= sc.nextInt();
		
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		System.out.println("Enter third number");
		int c= sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("The greater number is " +a);
		}
		 else if (b>a && b>c) {
			 System.out.println("The Greater number is:"+b);
			
		}
		 else {
			 System.out.println("The grater number is:"+c);
		 }
		
	}

}
