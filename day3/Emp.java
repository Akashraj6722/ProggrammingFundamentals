package com.chainsys.day3;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
      
		 int age ;
	       char gender;
	       
	       
	       System.out.println("Enter the age");
	       Scanner input=new Scanner(System.in);
	       age=input.nextInt();
	       while(age<0) {
	    	   System.out.println("enter the valid age");
		       age=input.nextInt();

	       }
	       
	       System.out.println("Enter 'M' or 'm' if you're a male OR Enter 'F'or 'f' if you're a female");
	       gender= input.next().charAt(0);
	       while(true) {
	    	   if(gender=='m' || gender=='f') {
	    		  
	    	       break;
		    	  
		    	  }
	    	   else  {
		    	   System.out.println("enter the valid gender");
		    	   gender=input.next().charAt(0);
		    	   
	    	    
		    	   
		    	   
		    	
             if(gender=='F'||gender == 'f')
	       { 
	    	   System.out.println("you must work in urban areas");
	       
	       }
	       else if(gender== 'M' ||gender=='m')
	       {
	        if(age>=20 && age<=40) 
	       {
	    	   System.out.println("you can work in anywhere");
	       }
	       else if(age>=40 && age<=60) 
	       {
	    	   System.out.println("you must work in urban areas");
	       }
	       else
	       {
	    	   System.out.println("ERROR");
	       }
	         
	       }
	}
	       
	       }

	}
}

	    	  
	


