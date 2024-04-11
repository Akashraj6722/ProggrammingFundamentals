package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg1 {

	public static void main(String[] args) {
               Scanner input =new Scanner(System.in);
               String sentence="HI! iam a Trainee";
              
               System.out.println("Enter the Text to find");
               Pattern p=Pattern.compile(input.nextLine());
               Matcher m=p.matcher(sentence);
             
               
               while(m.find()) {
            	   System.out.println("the entered text "+m.group()+" is found in index "+m.start()+" and ends in "+m.end());
               }
               
               
               
               
	}

}
