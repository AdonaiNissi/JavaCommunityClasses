package io.ineuron.assignment1;

public class TeluskoIneuron {
	
	public static void main(String[] args) {
		
		
		String str = "TELUSKOINEURON";
		AlphabetPattern a = new AlphabetPattern();
		
		for(int i=0 ; i< str.length() ;  i++) {
		char ch = str.charAt(i);
		a.printChar(ch);
		System.out.println("=======");
		}
		
		
		
	}

	

}
