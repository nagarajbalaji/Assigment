package com.app.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.FundTransferPageExe;

public class TransactionPage extends FundTransferPageExe{
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//table[@id='_ctl0__ctl0_Content_Main_MyTransactions']//tr[2]//td[5]")
private WebElement depositAmount;

@FindBy(xpath="//table[@id='_ctl0__ctl0_Content_Main_MyTransactions']//tr[3]//td[5]")
private WebElement WithdrawnAmount;

@FindBy(xpath="//a[contains(text(),'Recent')]")
private WebElement transactionHistory;

public  WebElement depositAmount()
{
	return depositAmount;
}
public  WebElement withdrawnAmount()
{
	return WithdrawnAmount;
}
public  WebElement clicktransactionHistory()
{
	return transactionHistory;
}
}
