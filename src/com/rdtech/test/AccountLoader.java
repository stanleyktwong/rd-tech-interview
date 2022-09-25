package com.rdtech.test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountLoader 
{
	
	public AccountLoader() {
		
	}
	
	public static List<Account> loadFile(String inFilePath)
	{
		String filePath = inFilePath;
		BufferedReader bfrdAccFile;
		List<Account> listOfAccount = new ArrayList<Account>();;
		Account accountEach;
		String strSrcAccData;
		String[] strDestAccData;
		
		try {
			bfrdAccFile = new BufferedReader(new FileReader(filePath));

			strSrcAccData = bfrdAccFile.readLine();
			while (strSrcAccData != null) 
			{
				strDestAccData = new String[5];
				strDestAccData = strSrcAccData.split(";");
				accountEach = new Account( strDestAccData[0], strDestAccData[1], strDestAccData[2], strDestAccData[3], strDestAccData[4]);
				listOfAccount.add(accountEach);
				strSrcAccData = bfrdAccFile.readLine();
			}
			
		} catch (FileNotFoundException eFNF) {
			// TODO Auto-generated catch block
			eFNF.printStackTrace() ;
		} catch (IOException eIO) {
			eIO.printStackTrace();
		}
		
		return listOfAccount;
	}
}
