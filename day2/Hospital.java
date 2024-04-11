package com.chainsys.day2;

import java.util.*;

public class Hospital {

	public static void main(String[] args) {
		String hospitalName;
		String location;
		int normalWards;
		int emergencyWards;
		
		System.out.println("Enter the Hospital name");
		Scanner input=new Scanner(System.in);
		hospitalName=input.next();
		System.out.println("Enter the Location ");
		location=input.next();
		System.out.println("Enter the NumberOfNormalWards ");
		normalWards=input.nextInt();
		System.out.println("Enter the NumberOfEmergencyWards ");
		emergencyWards=input.nextInt();


		System.out.println("Hospital name:" + hospitalName + "\n" + "Location:" + location + "\n" +"NumberOfNormalWards:"+ normalWards +"\n"+"NumberOfEmergencyWards:" + emergencyWards );				
				

	}

}
