package com.app.pageexe;

import org.testng.Assert;

import com.app.pagefactory.TransactionPage;

public class TransactionPageExe extends TransactionPage {
	static String depositAmount;
	static String withdrawnAmount;

	public static void transactionHistory()
	{
		clickdata(new TransactionPage().clicktransactionHistory());
	}
	
	public static void transferedAmountValidation()
	{
		depositAmount = getText(new TransactionPage().depositAmount()).trim();
		withdrawnAmount = getText(new TransactionPage().withdrawnAmount()).trim();
		Assert.assertEquals(depositAmount, "$9876.00");
		Assert.assertEquals(withdrawnAmount, "-$9876.00");
	}
	
}
