package com.chainsys.day3;

import java.util.Scanner;

public class Exp {

	public static void main(String[] args) {
		int x,y,z;
		Scanner input=new Scanner(System.in);
		
		
/*		a. x == 2
				b. x != 5
				c. x != 5 && y >= 5
				d. z != 0 || x == 2
		e. !(y < 10) */	
    System.out.println("Enter the x value:");
    x=input.nextInt();
    
    System.out.println("Enter the x value:");
    y=input.nextInt();

    
    System.out.println("Enter the x value:");
    z=input.nextInt();
     
    while(x<0 || y<0 || z<0) {
    	System.out.println("Don't enter negative numbers");
    	System.out.println("Enter the x value:");
        x=input.nextInt();
        
        System.out.println("Enter the x value:");
        y=input.nextInt();

        
        System.out.println("Enter the x value:");
        z=input.nextInt();
    	
    }

	System.out.println(x == 2);
	System.out.println(x != 5);
	System.out.println(x != 5 && y >= 5);
	System.out.println(z != 0 || x == 2);
	System.out.println(!(y < 10));

				
			
				

	}

}
