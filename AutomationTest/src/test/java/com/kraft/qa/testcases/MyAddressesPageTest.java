package com.kraft.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.kraft.qa.base.TestBase;
import com.kraft.qa.pages.LoginPage;
import com.kraft.qa.pages.MyAccountPage;
import com.kraft.qa.pages.MyAddressesPage;
import com.kraft.qa.util.TestUtil;

public class MyAddressesPageTest extends TestBase {
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddrespage;
	String sheetName="address";
	
	
	public MyAddressesPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		myAccountPage=new MyAccountPage();
		myAddrespage=new MyAddressesPage();
		myAccountPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		myAccountPage.verifyMyAccountPageTitle();
		myAddrespage=myAccountPage.clickOnMyAddressessLink();
		
	}
	
	@Test(priority = 1)
	public void verifyMyAddressLabel()
	{
		Assert.assertTrue(myAddrespage.verifyMyAddressLabel(),"My address label is missing on page");
		
	}
	
	@Test(priority = 2,dataProvider = "getAutomationTestData")
	public void createNewAddress(String fName,String lName,String company,String addrss1,String addrss2,String city,String state,String postalCode,String homePhone,String mobilePhone,String additionalInformaion,String alias)
	{
		myAddrespage.clickOnAddNewAddressLink();
		myAddrespage.addNewAddress(fName, lName, company, addrss1, addrss2, city, state, postalCode, homePhone, mobilePhone, additionalInformaion, alias);
	}
	
	@DataProvider
	public Object[][] getAutomationTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
