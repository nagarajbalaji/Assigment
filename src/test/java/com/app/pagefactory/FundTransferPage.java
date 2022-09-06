package com.app.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;
import com.app.pageexe.HomePageExe;

public class FundTransferPage extends HomePageExe {
	
	public FundTransferPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="toAccount")
	private WebElement toAccount;
	
	@FindBy(id="transferAmount")
	private WebElement transferAmount;
	
	@FindBy (name="transfer")
	private WebElement transfer;
	
	@FindBy(xpath="//span[contains(text(),'9876.0 was successfully transferred from Account 8')]")
	private WebElement transferValidation;
	
	public WebElement toAccount()
	{
		return toAccount;
	}
	public WebElement transferAmount()
	{
		return transferAmount;
	}
	public WebElement transfer()
	{
		return transfer;
	}
	public WebElement transferValidation()
	{
		return transferValidation;
	}
}
