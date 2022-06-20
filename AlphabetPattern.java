package io.ineuron.assignment1;

public class AlphabetPattern {
	
	static int r=100;
	static int c = 100;
	
	public static void printChar(char ch) {
		
		
		switch(ch) {
			case 'T':
				printT();
				break;
			
			case 'E':
				printE();
				break;
			case 'L':
				printL();break;
			case 'U':
				printU();break;
			case 'S':
				printS();break;
			case 'K':
				printK();break;
			case 'O':
				printO();break;
			case 'I':
				printI();break;
			case 'N':
				printN();break;
			case 'R':
				printR();break;
			/*
			 * default :{ System.out.println("Thankyou for this assignment it really helped me get rid of my fear for star patterns"); }
			 */ 
			
		}
		
			
	}
	
	
	private static void printT() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 1 || c == 3)   //Letter T
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printE() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 1 || r == 3 || r == 5 || c == 1)   //Letter E
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	private static void printL() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 5 || c == 1)   //Letter L
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	private static void printU() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 5 || c == 1 || c == 5)   //Letter U
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printS() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 5 || r == 1 || r == 3 || (c == 1 && r <=3) || (c == 5 && r > 3))   //Letter S
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printK() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(c == 1 || (r == 3 && c == 2) || (c == r && c >=3) || (r+c == 6 && c>=3))   //Letter K
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printO() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(c == 1 || r == 1 || r == 5 || c == 5)   //Letter O
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	private static void printI() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(r == 1 || r == 5 || c == 3)   //Letter I
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printN() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(c == 1 || r == c || c == 5)   //Letter N
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	private static void printR() {
		for(r =1 ;r<= 5; r++) {
			for(c =1 ;c<= 5; c++) {
				if(c == 1 || r == 1 || r == 3 || (c == 5 && r <= 3) || (c==r && c>3 ))   //Letter R
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	

}
