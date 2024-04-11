package com.chainsys.day2;

import java.util.*;

public class Book {

	public static void main(String[] args) {
		String bookName;
		String author;
		int pages;
		
		System.out.println("Enter the Book name");
		Scanner input=new Scanner(System.in);
		bookName=input.next();
		System.out.println("Enter the author Name ");
		author=input.next();
		System.out.println("Enter the NumberOfPages ");
		pages=input.nextInt();
		System.out.println("Book name:" + bookName + "\n" + "author:" + author + "\n" +"NumberOfPages:"+ pages );				
				
		

	}

}
