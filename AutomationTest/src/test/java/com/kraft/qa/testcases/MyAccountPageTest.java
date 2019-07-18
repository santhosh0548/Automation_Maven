package com.kraft.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kraft.qa.base.TestBase;
import com.kraft.qa.pages.LoginPage;
import com.kraft.qa.pages.MyAccountPage;
import com.kraft.qa.pages.MyAddressesPage;

public class MyAccountPageTest extends TestBase {
	
	LoginPage loginPage;
	
	
	
	public MyAccountPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
