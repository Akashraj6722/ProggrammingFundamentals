package com.chainsys.day3;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
          String userName;
          String passWord;
          
          System.out.println("Signup");
          
          System.out.println("Enter the userName:");
          Scanner input=new Scanner(System.in);
          userName=input.next();
          while(userName==" ") {
        	  System.out.println("Enter the valid name");
        	  userName=input.next();
          }
          System.out.println("Enter the passWord:");
         
          passWord=input.next();
          while(passWord==" ") {
        	  System.out.println("Enter the valid passWord");
        	  passWord=input.next();
          }
          System.out.println("Signed up succesfully");
          
          System.out.println("Login");
          

          String username;
          String password;
          
          System.out.println("Enter the username:");
          
          username=input.next();
          while(username==" ") {
        	  System.out.println("Enter the valid name");
        	  username=input.next();
          }
          System.out.println("Enter the password:");
         
          password=input.next();
          while(password==" ") {
        	  System.out.println("Enter the valid password");
        	  password=input.next();
          }
          
          if(userName==username && passWord==password) {
        	  
        	  System.out.println("Login is succesfull");
          }
          else{
        	  System.out.println("Incorrect username or password");
          }
          
          
	
          
          
	}

}
