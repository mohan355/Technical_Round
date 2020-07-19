package Javaquestions;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		
		String str="mohan kafle";
		
		int count=0;
		
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			
			
		}
		System.out.println("total number is: "+count);

		
		
	}
		
}

	
