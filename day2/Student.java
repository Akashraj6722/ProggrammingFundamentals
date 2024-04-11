package com.chainsys.day2;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		
		String studentName;
		String collegeName;
		int rollNO;
		int percentage;
		
		System.out.println("Enter the Student name");
		Scanner input=new Scanner(System.in);
		studentName=input.next();
		System.out.println("Enter the College Name ");
		collegeName=input.next();
		System.out.println("Enter the Roll Number ");
		rollNO=input.nextInt();
		System.out.println("Enter the Percentage ");
		percentage=input.nextInt();


		System.out.println("Student name:" + studentName + "\n" + "College Name:" + collegeName + "\n" +"Roll Number:"+ rollNO +"\n"+"Percentage:" + percentage +"%" );				
				


	}

	}

