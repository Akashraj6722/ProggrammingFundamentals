package com.chainsys.day3;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
               int salary;
               int years;
               int bonus;
               
               System.out.println("Enter the salary:");
               Scanner input = new Scanner(System.in);
               
               salary = input.nextInt();
               if(salary>0)
               {
               System.out.println("number of years worked");
               
               years = input.nextInt();
               if(years>0) {
                
               if (years > 5) {
            	   bonus=salary*105/100- salary;
            	   System.out.println("Your salary amount:"+salary);
            	   System.out.println("bonus amount for you:" + bonus);
            	   int bSalary=salary+bonus;
            	   System.out.println("Your salary after bonus:" + bSalary);
            	   
               }
               else {
            	   System.out.println("There is no bonus for you");
               }
               }else {
            	   System.out.println("Enter the valid years");
               }
               }else {
            	   System.out.println("Enter the valid salary amount");
               }
	}

}
