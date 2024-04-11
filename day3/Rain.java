package com.chainsys.day3;

import java.util.Scanner;

public class Rain {

	public static void main(String[] args) {
		char reply;
	    int temp=0;
       System.out.println("Is it raining?");
       
       System.out.println("Press y if YES \n OR \n Press any key if NO");
       
       Scanner input=new Scanner(System.in);
       reply=input.next().charAt(0);
       
       if(reply=='y') {
    	   System.out.println("Take the UMBRELLA");
    	   
       }else  
       {     
    	   System.out.println("NO UMBRELLA needed");
       }
    	   System.out.println("Whats the temperature");
    	   temp=input.nextInt();
    	   
       if(temp<30) {
    	   System.out.println("bring HEAVY JACKET");
    	   
       }else if(temp>=32 && temp<=50) {
    	   System.out.println("bring LIGHT JACKET");
    	   
    	   
       }else {
    	   System.out.println("NO JACKET needed");
       }
       
	}

}
