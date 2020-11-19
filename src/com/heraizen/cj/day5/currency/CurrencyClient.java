package com.heraizen.cj.day5.currency;

import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the String");
	String country = sc.nextLine();
	Currency c = CurrencyContainer.getCurrency(country);
	System.out.println(country+"  country currency is "+c.getCurrency());
	}

}




