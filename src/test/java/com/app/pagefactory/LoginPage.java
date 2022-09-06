package com.app.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="_ctl0__ctl0_Content_Main_message")
	private WebElement failMessage;
	
	@FindBy(id="LoginLink")
	private WebElement signin;
	
	@FindBy(id="uid")
	private WebElement username;
	
	@FindBy(id="passw")
	private WebElement password;
	
	@FindBy(name="btnSubmit")
	private WebElement login;
	
	@FindBy(xpath="//h1")
	private WebElement loginValidation;
	
	public WebElement signIn()
	{
		return signin;
	}
	
	public  WebElement userName()
	{
		return username;
	}
	public  WebElement passsword()
	{
		return password;
	}
	public  WebElement login()
	{
		return login;
	}
	public  WebElement loginValidation()
	{
		return loginValidation;
	}
	public  WebElement loginFailMessage()
	{
		return failMessage;
	}
	
	

}
