package com.chainsys.day2;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		
       int num1,num2,num3;
	   System.out.println("Ente num1:");
	   Scanner input= new Scanner(System.in);
	   num1 = input.nextInt();
	   System.out.println("Ente num2:");
	   num2 = input.nextInt();
	   System.out.println("Ente num3:");
	   num3 = input.nextInt();
	    if(num1>num2 && num1>num3)
	    	System.out.println("num1 is greater");
	    else if(num2>num1 && num2>num3)
	    System.out.println("num2 is greater");
	    else if(num3>num1 && num3>num2)
	    	System.out.println("num3 is greater");
	    else
	    	System.out.println("All numbers are equal");
	    




	   
		
	}

}
