package com.app.pageexe;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.app.pagefactory.HomePage;

public class HomePageExe extends HomePage {

	public static void viewAccountSummary()
	{
		clickdata(new HomePage().accountSummary());
	}
	public static void selectAccountAndGo()
	{
		//waits(By.xpath("//select[@id='listAccounts']"));
		selectData(new HomePage().accounntList(), "800001");
		clickdata(new HomePage().Go());
	}
	public static void validateAccountBalance()
	{
		String balance = getText(new HomePage().availBalance()).trim();
		Assert.assertEquals(balance, "$114282.44", "Balance is not matching");
	}
	
	public static void transferFunds()
	{
		clickdata(new HomePage().transferFund());
	}

}
