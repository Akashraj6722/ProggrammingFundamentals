package com.chainsys.day3;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
         
		int num;
		System.out.println("Enter the limit");
		Scanner input=new Scanner(System.in);
		
		num=input.nextInt();
		while(num<1) {
			System.out.println("Enter the positive number");
			num=input.nextInt();

		}
		
		System.out.println("Cube of a given num:");
		int cube=num*num*num;
		System.out.println(cube);
		
		System.out.println("Even numbers are:");
		for(int i=1;i <= num;i++){
		
			
			if(i%2==0) {
			System.out.println(i);
		}
		}
		System.out.println("Odd numbers are:");
		for(int i=1;i <= num;i++){
		
			
			if(i%2!=0) {
			System.out.println(i);
			
	}

}
	}
}

