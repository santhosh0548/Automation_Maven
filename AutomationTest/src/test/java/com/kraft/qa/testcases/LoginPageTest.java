package com.kraft.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kraft.qa.base.TestBase;
import com.kraft.qa.pages.HomePage;
import com.kraft.qa.pages.LoginPage;
import com.kraft.qa.pages.MyAccountPage;

public class LoginPageTest extends TestBase 
{
	LoginPage loginPage;
	HomePage homePage;
	MyAccountPage myAccountPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String actualTitle=loginPage.validateLoginPageTitle();
		Assert.assertEquals(actualTitle, "Login - My Store");
	}
	
	@Test(priority = 2)
	public void loginPageLogoTest()
	{
		boolean flag=loginPage.validatePageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest()
	{
		myAccountPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
