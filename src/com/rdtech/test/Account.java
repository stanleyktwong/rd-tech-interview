package com.rdtech.test;

// It is a class representing as account with field
//  number, balance and balance date (yyyy-mm-dd)
//
public class Account 
{
	private String Number;
	private String Balance;
	private String Year;
	private String Month;
	private String Day;
	
	public Account(String number, String balance, String year, String month, String day)
	{
		this.Number = number;
		this.Balance = balance;
		this.Year = year;
		this.Month = month;
		this.Day = day;
	}

	public String popBalance()
	{
		return Balance;
	}
	public String popYear()
	{
		return Year;
	}
	public String popMonth()
	{
		return Month;
	}
	public String popDay()
	{
		return Day;
	}
	public String popNumber()
	{
		return Number;
	}
}
