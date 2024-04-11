package com.chainsys.day3;

import java.util.Scanner;

public class Multable {

	public static void main(String[] args) {
     int multiplier,limit;
     
     Scanner input =new Scanner(System.in);
     System.out.println("Enter the limit");
     
     limit=input.nextInt();
     if(limit>0) {
     
     System.out.println("Enter the multiplier");
     multiplier=input.nextInt();
     
     for(int i=1;i<=limit;i++)
     {
    	 System.out.println(multiplier + "*"+i  + "=" + (multiplier*i));
     }
     
	}
     else 
 	{
 		System.out.println("Invalid data");
 	}
 	}

	}
	

