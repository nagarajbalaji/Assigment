package com.app.execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.base.DataProviders;
import com.app.pageexe.ContactUsPageExe;
import com.app.pageexe.FundTransferPageExe;
import com.app.pageexe.HomePageExe;
import com.app.pageexe.LoginPageExe;
import com.app.pageexe.TransactionPageExe;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Execution extends ContactUsPageExe {
	

	@Test(dataProviderClass = DataProviders.class, dataProvider = "usernameandpassword",priority=1)
	public void loginUsingCorrectCredentials(String uname, String pass) {
		uNameAndPass(uname, pass);
		clickLogin();
		validationOfCorrectLogin();
	}
	@Test(dataProviderClass = DataProviders.class, dataProvider = "incorrectusernameandpassword",priority = 0)
	public void loginUsingIncorrectCredentials(String uname, String pass) {
		signin();
		uNameAndPass(uname, pass);
		clickLogin();
		validationOfIncorrectLogin();
	}
	
	
	
	@Test(priority = 2)
	public void availableBalanceValidation() {
		accountSummary();
		selectAccountAndGo();
		validateAccountBalance();
		
	}
	@Test(priority = 3)
	public void fundTransferandValidation()
	{
		transferFunds();
		selectToAccount();
		enterAmountToTransfer();
		transferTheAmount();
		validationOfFundTransfer();
		
	}
	@Test(priority = 4)
	public void viewTransactionHistory()
	{
		transactionHistory();
		transferedAmountValidation();
	}
	@Test(priority = 5)
	public void fillTheOnlineForm() {
		clickContactUs();
		onlineForm();
		fillingTheForm();
		
	}
	@Test(priority = 6)
	public void signOffValidation()
	{
		signOff();
	}
	
	

}
