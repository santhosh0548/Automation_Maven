package com.kraft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kraft.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	//Page Factory - OR
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signInBtn;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement 	logo;
	
	//initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validatePageLogo()
	{
		return logo.isDisplayed();
	}
	
	public MyAccountPage login(String uName,String psswd)
	{

		username.sendKeys(uName);
		password.sendKeys(psswd);
		signInBtn.click();
		
		return new MyAccountPage();
	}
	
	
	
	
	

}
