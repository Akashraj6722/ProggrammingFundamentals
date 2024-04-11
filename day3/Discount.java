package com.chainsys.day3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
           int q;
           int res;
           
           System.out.println("Enter the quantity");
           Scanner input=new Scanner(System.in);
           
           q= input.nextInt();
           if(q>0) 
           {
           int unit=q*100;
           
           if(unit>1000) {
        	   res=unit*90/100;
           System.out.println("10% discount,Total charges:"+ res);
           }
           else
        	   System.out.println("There is no discount for you,Total charges:" + unit);
        	   
	}
           else 
       	{
       		System.out.println("Enther the valid quantity");
       	}
	}
	

}
