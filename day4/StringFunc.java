package com.chainsys.day4;

public class StringFunc {

	public static void main(String[] args) {
            
		char info[]= {'p','q','r','s'};
		String str =new String(info);
		System.out.println(str);
		
		String dialogue="Welcome homa";
		System.out.println(dialogue.replace('a', 'e'));//replaces char a with e
		System.out.println(dialogue.codePointCount(1, 5));//it counts the length from start point to end point
		
		
		String a="Hi";
		String b=" How are you";
		String c="HI";
		System.out.println(a.concat(b));//it joins number of string
				 
		System.out.println(a.compareTo(c)); //compares two strings
		System.out.println(a.compareToIgnoreCase(c));//compares two strings ignores Upper case & Lower case
		System.out.println(b.contains("you"));// checks the word in a string whether it contains or not
		
		String d="Have a good day";
		System.out.println(d.copyValueOf(info, 1, 3));//copy value from info from index 1to3
		System.out.println(d.endsWith("good"));//checks the end
		System.out.println(d.startsWith("Have"));//checks the start
		
		
		
	}

}
