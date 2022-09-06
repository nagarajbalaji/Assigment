package com.app.pageexe;

import org.testng.Assert;

import com.app.pagefactory.FundTransferPage;

public class FundTransferPageExe extends FundTransferPage{
	public static void selectToAccount()
	{
		selectData(new FundTransferPage().toAccount(), "800001");
	}
	public static void enterAmountToTransfer()
	{
		sendData(new FundTransferPage().transferAmount(), "9876");
	}
	public static void transferTheAmount()
	{
		clickdata(new FundTransferPage().transfer());
	}
	
	public static void validationOfFundTransfer()
	{
		String transferedAmount = getText(new FundTransferPage().transferValidation()).trim();
		Assert.assertTrue(transferedAmount.contains("9876"));
	}

}
