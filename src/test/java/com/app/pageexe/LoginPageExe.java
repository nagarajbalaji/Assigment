package com.app.pageexe;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.app.base.BaseClass;
import com.app.pagefactory.LoginPage;

public class LoginPageExe extends LoginPage{

	public static void signin()
	{
		clickdata(new LoginPage().signIn());
	}
	public static void uNameAndPass(String uname,String pass)
	{
	sendData(new LoginPage().userName(), uname);	
	sendData(new LoginPage().passsword(), pass);
	}
	public static void clickLogin()
	{
		clickdata(new LoginPage().login());
	}
	public static void validationOfCorrectLogin()
	{
		String text = getText(new LoginPage().loginValidation()).trim();
		Assert.assertEquals(text, "Hello Admin User", "Login Unsuccessful");
		
	}
	public static void validationOfIncorrectLogin()
	{
		String text = getText(new LoginPage().loginFailMessage()).trim();
		Assert.assertEquals(text, "Login Failed: We're sorry, but this username or password was not found in our system. Please try again.", "Login successful");
		
	}
}
