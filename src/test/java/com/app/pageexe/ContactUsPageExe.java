package com.app.pageexe;

import org.testng.Assert;

import com.app.pagefactory.ContactUsPage;

public class ContactUsPageExe extends ContactUsPage{
	public static void clickContactUs()
	{
		clickdata(new ContactUsPage().contactUs());
	}
public static void onlineForm()
{
clickdata(new ContactUsPage().form());	
}

public static void fillingTheForm()
{
new ContactUsPage().name().clear();
sendData(new ContactUsPage().name(), "Nagarajan");
sendData(new ContactUsPage().email(), "nagarajbanu.ns@gmail.com");
sendData(new ContactUsPage().subject(), "XXXXXXX");
sendData(new ContactUsPage().comments(), "XXXXXYYYYYYZZZZZZ");
clickdata(new ContactUsPage().submit());
}

public static void signOff()
{
clickdata(new LoginPageExe().signIn());
String siginStatus = getText(new LoginPageExe().signIn()).trim();
Assert.assertEquals(siginStatus, "Sign In");
}
}
