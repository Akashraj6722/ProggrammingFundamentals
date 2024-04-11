package com.chainsys.day4;

public class Disc {
	
	public static void fare(int num) {
		int discount;
		
		if(num>2000) {
		discount=num*98/100;
		System.out.println(" YOU HAVE 2%DISCOUNT  you need to pay rupees "+ discount +" only");
	}else if(num>5000) {
		discount=num*95/100;
		System.out.println("you need to pay rupees "+ discount +" only");
	}else {
		System.out.println("There is no discount for you");
	}
		
	}

}
