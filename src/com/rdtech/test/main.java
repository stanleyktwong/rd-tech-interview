package com.rdtech.test;

import java.util.ArrayList;
import java.util.List;

public class main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Account> readAccList;
	
		System.out.println("Account Loader");
		System.out.println("---------------------------------------------");
		System.out.println("Record of customer account details");
		System.out.println("Number\t\t|Balance\t|Balance Date");
		System.out.println("---------------------------------------------");
		
		readAccList = new ArrayList<Account>();
		readAccList = AccountLoader.loadFile("AccRecord.txt"); // Read default file.

		
		for ( Account acc : readAccList)
		{
			System.out.print(acc.popNumber() + " " );
			System.out.print(acc.popBalance() + "\t ");
			System.out.println(acc.popYear() + "-" + acc.popMonth() + '-' + acc.popDay() +"\t");
		}
	}	
}
