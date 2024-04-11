package com.chainsys.day2;


import java.util.*;

public class Operators {

	public static void main(String[] args) {
		int principalAmount;
		int numberOfYears;
		float rateOfInterest;
		
		System.out.println("Enter the principal amount");
		Scanner input= new Scanner(System.in);
		
		principalAmount =input.nextInt();
		System.out.println("Enter the Number Of Years");
		numberOfYears=input.nextInt();
		
		System.out.println("Enter the Rate Of Interest");
		rateOfInterest=input.nextInt();
		
		float s= principalAmount * numberOfYears * rateOfInterest;
		
		float si= s / 100  ;
		
		System.out.println("Simple Interest:"+ si );

	}

}
