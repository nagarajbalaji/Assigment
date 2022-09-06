package com.app.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.TransactionPageExe;

public class ContactUsPage extends TransactionPageExe {
	public ContactUsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	private WebElement contactUs;
	
	@FindBy(partialLinkText=("online"))
	private WebElement onlineForm;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="email_addr")
	private WebElement email;
	
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(name="comments")
	private WebElement comments;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public WebElement contactUs() {
		return contactUs;
	}
	public WebElement form() {
		return onlineForm;
	}
	public WebElement name() {
		return name;
	}
	public WebElement email() {
		return email;
	}
	public WebElement subject() {
		return subject;
	}
	public WebElement comments() {
		return comments;
	}
	public WebElement submit() {
		return submit;
	}
}
