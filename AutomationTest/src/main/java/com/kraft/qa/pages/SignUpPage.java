package com.kraft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kraft.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(name="email_create")
	WebElement emailCreate;
	
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement submitCreateBtn;
	
	
	
}
