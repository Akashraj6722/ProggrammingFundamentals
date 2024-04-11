package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEg {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String USERNAME="[a-zA-Z]{1,11}";
		Pattern a=Pattern.compile(USERNAME);
		String userName;
		System.out.println("Enter user name :");
		userName=input.next();
		
		    String PASS="[a-zA-Z0-9$@#%]{8,15}";
			Pattern b=Pattern.compile(PASS);
			String pass;
			System.out.println("Enter passWord :");
			pass=input.next();
			
			String OTP="[0-9]{4}";
			Pattern c=Pattern.compile(PASS);
			String otp;
			System.out.println("Enter OTP :");
			otp=input.next();
	    
	    
	   
	     while(true) {
	    	 if(userName.matches(USERNAME)) {
	    		 break;
	    	 }
	    		 System.out.println("invalid username");
	    		 userName=input.next();
	     }
	     
	      
		  while(true) {
		    	 if(pass.matches(PASS)) {
		    		 break;
		    	 }
		    		 System.out.println("invalid passWord");
		    		 pass=input.next();
		     }
		   while(true) {
		    	 if(otp.matches(OTP)) {
		    		 break;
		    	 }
		    		 System.out.println("invalid otp");
		    		 userName=input.next();
		     }
		   System.out.println("SIGNED IN successfully");
			
	     
	    		 
	    	 
	    	 
	     }
	     

	
	
	
	
}



