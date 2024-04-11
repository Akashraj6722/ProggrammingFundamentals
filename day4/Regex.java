package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
          
		Pattern p = Pattern.compile("...chainsys....");
		Matcher m =p.matcher("www.chainsys.com");
		boolean b=m.matches();
		System.out.println(b);
	
		Pattern s=Pattern.compile("a....raj");
		Matcher a=s.matcher("akashraj");
		boolean z=a.matches();
		System.out.println(z);
		
		boolean b1=Pattern.matches(".ell.", "hello");
		System.out.println(b1);
		
		System.out.println(Pattern.matches(".java", "java"));
		
		
	}

}
