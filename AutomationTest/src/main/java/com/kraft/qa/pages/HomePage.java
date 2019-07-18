package com.kraft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kraft.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//span[contains(text(),'demo')]")
	WebElement userNameLabel;
	
}
