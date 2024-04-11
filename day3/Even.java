package com.chainsys.day3;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// Find the even digits in the given number.
        int limit;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the limit:");
        limit=input.nextInt();
        while(limit<1) {
        	System.out.println("Enter valid numbers");
        	limit=input.nextInt();
        }
        
        for(int i=1;i<=limit;i++) {
         if(i%2==0) {
        	 System.out.println(i);
         }
        	
        	
        }
	}

}
