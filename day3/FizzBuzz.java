package com.chainsys.day3;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

        int limit;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the limit:");
        limit=input.nextInt();
        
        while(limit<1) {
        	System.out.println("Enter valid numbers");
        	limit=input.nextInt();
        }
        
        for(int i=1;i<=limit;i++) {
         if(i%3==0 && i%5==0) {
        	 System.out.println( i +"-FizzBuzz");
         }else if(i%3==0) {
        	 System.out.println(i+"-Fizz");
         }else if(i%5==0) {
        	 System.out.println(i+"-Buzz");
         }else {
        	 
         }
        	
        	
        }
	
             
	}

}
