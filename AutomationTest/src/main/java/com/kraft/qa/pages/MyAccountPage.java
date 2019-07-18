package com.kraft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kraft.qa.base.TestBase;

public class MyAccountPage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'demo')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//h1[text()='My account']")
	WebElement myAccountLabel;
	
	@FindBy(xpath="//a[@title='Orders']")
	WebElement ordersLink;
	
	@FindBy(xpath="//a[@title='Credit slips']")
	WebElement myCreditSlipsLink;
	
	@FindBy(xpath="//a[@title='Addresses']")
	WebElement myAddressesLink;
	
	@FindBy(xpath="//a[@title='Information']")
	WebElement myPersonalInformationLink;
	
	@FindBy(xpath="//a[@title='My wishlists']")
	WebElement myWishlistsnLink;
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMyAccountPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public OrdersHistoryPage clickOnMyOrdersLink()
	{
		ordersLink.click();
		
		return new OrdersHistoryPage();
	}
	
	public CreditSlipsPage clickOnMyCreditSlipsLinks()
	{
		myCreditSlipsLink.click();
		
		return new CreditSlipsPage();
	}
	
	public MyAddressesPage clickOnMyAddressessLink()
	{
		myAddressesLink.click();
		
		return new MyAddressesPage();
	}
	
	
	
}
