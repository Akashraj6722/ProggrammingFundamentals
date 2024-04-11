package com.chainsys.day4;

import java.util.Scanner;

public class CabAmount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		System.out.println("Enter the name");
		name=input.next();
		System.out.println("Welcome "+ name);
		
		System.out.println("Available cabs:");
		System.out.println("1.micro" +"\n"+ "2.mini"+"\n"+ "3.prime");
		

		String cabType;

		int km,amount,discount;

		System.out.println("Enter the cabType");
		cabType=input.next().toLowerCase();
		Disc d=new Disc();

		while(true) {
			if(cabType.equals("micro")) {
				System.out.println("Enter the kilometers");
				
				while(true) {
					km=input.nextInt();
					if(km<0) {
						System.out.println("Enter the kilometers");
						km=input.nextInt();
						break;
					}
					amount=10*km;
					System.out.println(amount);
					d.fare(amount);

				}




			}else if(cabType.equals("mini")) {
				System.out.println("Enter the kilometers");
				
				while(true) {
					km=input.nextInt();
					if(km<0) {
						System.out.println("Enter the kilometers");
						km=input.nextInt();
						break;
					}
					amount=10*km;
					System.out.println(amount);
					d.fare(amount);
				}

			}else if(cabType.equals("prime")) {
				System.out.println("Enter the kilometers");
				
				while(true) {
					km=input.nextInt();
					if(km>0) {
						System.out.println("Enter the kilometers");
						km=input.nextInt();
						break;
					}amount=10*km;
					System.out.println(amount);
					d.fare(amount);
				}
			}else {
				System.out.println("Enter the valid cabType");
				cabType=input.next().toLowerCase();

			}
		}


	}




}





