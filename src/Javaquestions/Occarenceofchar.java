package Javaquestions;

public class Occarenceofchar {

	public static void main(String[] args) {
		
		String s= "Mohan kafle";
		int all=s.length();
		int noall=s.replace("a", "").length();
		int onlyREm=all-noall;
		System.out.println(onlyREm);
	}

}
