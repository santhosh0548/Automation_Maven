package com.kraft.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.kraft.qa.base.TestBase;

public class MyAddressesPage extends TestBase {
	
	@FindBy(xpath="//h1[text()='My addresses']")
	WebElement myAddressesLabel;
	
	@FindBy(xpath="//a[@title='Add an address']")
	WebElement addNewAddresseLink;
	
	
	@FindBy(xpath="//h1[text()='Your addresses']")
	WebElement yourAddressesLabel;
	
	@FindBy(xpath="//input[@id='firstname2']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement txtCompany;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement txtAddress1;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement txtAddress2;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement txtCity;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement dropdownState;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement txtPostcode;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement txtHomePhone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement txtPhoneMobile;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement txtAdditionalInformation;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement txtAlias;
	
	@FindBy(id="submitAddress")
	WebElement btnSubmitAddress;
	
	
	
	
	public MyAddressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMyAddressesPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyMyAddressLabel()
	{
		return myAddressesLabel.isDisplayed();
	}
	
	public void clickOnAddNewAddressLink()
	{
		addNewAddresseLink.click();
	}
	
	public boolean verifyYourAddressesLabel()
	{
		return yourAddressesLabel.isDisplayed();
	}
	
	public void addNewAddress(String fName,String lName,String company,String addrss1,String addrss2,String city,String state,String postalCode,String homePhone,String mobilePhone,String additionalInformaion,String alias)
	{
		txtFirstName.sendKeys(fName);
		txtLastName.sendKeys(lName);
		txtCompany.sendKeys(company);
		txtAddress1.sendKeys(addrss1);
		txtAddress2.sendKeys(addrss2);
		txtCity.sendKeys(city);
		
		Select select=new Select(dropdownState);
		select.selectByVisibleText(state);
		
		txtPostcode.sendKeys(postalCode);
		txtHomePhone.sendKeys(homePhone);
		txtPhoneMobile.sendKeys(mobilePhone);
		txtAdditionalInformation.sendKeys(additionalInformaion);
		txtAlias.sendKeys(alias);
		
		btnSubmitAddress.click();
		
	}
	
	

}
