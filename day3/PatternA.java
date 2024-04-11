package com.chainsys.day3;

import java.util.*;

public class PatternA {

	public static void main(String[] args) {
		int limit;
		System.out.println("Enter the limit");
		
		Scanner input=new Scanner(System.in);
		limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
          
	}

}
