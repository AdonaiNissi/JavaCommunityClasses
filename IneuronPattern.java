package com.fundamentals;

public class IneuronPattern {

	public static void main(String[] args) {
		int n = 7 ;
		
		for(int r = 0 ;r< n; r++) {
			
			for(int c =0 ;c< n ; c++) {
				if(r == 0 || r == n-1 || c == (n-1)/2)   //Letter I
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			

			for(int c =0 ;c< n ; c++) {
				if(c == 0 || c == n-1 || r == c)   //Letter N
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
			for(int c =0 ;c< n ; c++) {
				if(c == 0 || r == n-1 || r == 0 || c == 0 || r == (n-1)/2)   //Letter E
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
			for(int c =0 ;c< n ; c++) {
				if(c == 0 || r == n-1 ||  c == n-1)   //Letter U
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
			for(int c =0 ;c< n ; c++) {
				if(c == 0 || r == 0 ||  r == (n-1)/2  || (c == n-1 && r <= (n-1)/2) || (c >= (n-1)/2 && r == c))   //Letter R
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
			for(int c =0 ;c< n ; c++) {
				if(c == 0 || r == n-1 ||  c == n-1 || r == 0)   //Letter O
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
			for(int c =0 ;c< n ; c++) {
				if(c == 0 || c == n-1 || r == c)   //Letter N
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("   ");
			
		System.out.println();
	}
		

	}

	}


