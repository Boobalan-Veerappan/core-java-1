package com.heraizen.cj.day5.currency;

class CurrencyContainer{
	static Currency getCurrency(String country)
	{
		Currency c = null;
		if(country .equalsIgnoreCase( "India"))
		{
			c =  new India();
		}
		else if(country.equalsIgnoreCase("USA"))
		{

			c =   new USA();
		}
		else if(country .equalsIgnoreCase( "UK"))
		{
			c =   new UK();
		}
		
		return c;
	}
}