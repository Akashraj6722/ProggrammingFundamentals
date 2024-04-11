package com.chainsys.day4;
import java.util.Scanner;

public class TeenCheck {
	
		
			
			public static boolean isTeen(int age1 ) {
				if(age1>=13 && age1<=19) {
			return true;
				}
			return false;
			}
			public static boolean hasTeen(int age1,int age2,int age3) {
				if(age1>=13 && age1<=19 || age2>=13 && age2<=19 || age3>=13 && age3<=19) {
					return true;
				}
				return false;
			}
		


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age1:");
		int age1=input.nextInt();
		
		System.out.println("Enter the age2:");
		int age2=input.nextInt();
		
		System.out.println("Enter the age3:");
		int age3=input.nextInt();
		
        System.out.println(hasTeen(age1,age2,age3));
        System.out.println(isTeen(age1));

		
		
	}
	
	
	

		

}

	



