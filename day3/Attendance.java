package com.chainsys.day3;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		
             float numberOfClassesHeld;
             float numberOfClassesAttended;
                          
             System.out.println("Enter the numberOfClassesHeld:"); 
             
             Scanner input = new Scanner(System.in);
             numberOfClassesHeld = input.nextInt();
             if(numberOfClassesHeld>0){
           
             System.out.println("numberOfClassesAttended :");
             numberOfClassesAttended = input.nextInt();
             if(numberOfClassesAttended>=0) {
        	 

             
            
             
             
             float percentage = numberOfClassesAttended / numberOfClassesHeld * 100;
           System.out.println(percentage);
             
             if(  percentage > 75 )
             {
            	 System.out.println("All the best for your exam");
            	 
             }
             else{
            	 System.out.println("enter Y if you have medical cause");
            	char medicalCause=input.next().charAt(0);
             
             if(medicalCause == 'Y')
             {
                System.out.println("All the best for your exam");
                  }
             
                  
                   else {
                	   System.out.println("You are not allowed to exam hall due to attendnce shortage");
                   }
             
             }
             }
             else {
            	 System.out.println("Enter the valid number");
             }
             }else {
            	 System.out.println("Enter the valid number");
             }
	
	}

}
