package com.chainsys.day2;

import java.util.*;

public class Movie {

	public static void main(String[] args) {
		String movieTitle;
		String hero;
		String actress;
		String director;
		int part;
		System.out.println("Enter the movieTitle");
		Scanner input=new Scanner(System.in);
		movieTitle=input.next();
		System.out.println("Enter the heroName ");
		hero=input.next();
		System.out.println("Enter the actressName ");
		actress =input.next();
		System.out.println("Enter the directorName ");
		director=input.next();
		System.out.println("Enter the moviePart ");
		part=input.nextInt();
		System.out.println("Movie name:"+movieTitle+"\n" + "Hero:"+hero+"\n" + "Actress:"+ actress +"\n"+"Director:"+director+"\n"+ "Part:"+ part);

		
		

	}

}
