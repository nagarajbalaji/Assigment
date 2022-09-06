package com.app.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;
import com.app.pageexe.LoginPageExe;

public class HomePage extends LoginPageExe {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Account')]")
	private WebElement accountSummary;

	@FindBy(xpath="//select[@id='listAccounts']")
	private WebElement accounntList;

	@FindBy(id = "btnGetAccount")
	private WebElement go;

	@FindBy(xpath = "//td[contains(text(),'Avail')]/following-sibling::td[1]")
	private WebElement availBalance;

	@FindBy(xpath = "//a[contains(text(),'Transfer')]")
	private WebElement transferFund;

	public WebElement accountSummary() {
		return accountSummary;
	}

	public WebElement accounntList() {
		return accounntList;
	}

	public WebElement Go() {
		return go;
	}

	public WebElement availBalance() {
		return availBalance;
	}

	public WebElement transferFund() {
		return transferFund;
	}

}
