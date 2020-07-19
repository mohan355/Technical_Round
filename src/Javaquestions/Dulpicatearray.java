package Javaquestions;

import java.util.HashSet;

public class Dulpicatearray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","c++","python","java"};
		
		boolean flag=false;
		HashSet<String>lang=new HashSet();
		for(String l:arr) {
			if(lang.add(l)==false) {
				System.out.println("duplicate:"+l);
				flag=true;
				
			}
		}
		if(flag==false) {
			System.out.println("not found duplicate");
	
}
	}

}
