package com.chainsys.day2;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		String bankName;
		String branch;
		int workingHours;
		int noOfEmployees;
		
		System.out.println("Enter the Bank name");
		Scanner input=new Scanner(System.in);
		bankName=input.next();
		System.out.println("Enter the Branch ");
		branch=input.next();
		System.out.println("Enter the Working hours ");
		workingHours=input.nextInt();
		System.out.println("Enter the Number of employees ");
		noOfEmployees=input.nextInt();


		System.out.println("Bank name:" + bankName + "\n" + "Branch:" + branch + "\n" +"Working hours:"+ workingHours + "hrs" +"\n"+"Number of employees:" + noOfEmployees );				
			
	}

}
