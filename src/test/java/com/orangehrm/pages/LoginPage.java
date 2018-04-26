package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utilities.Driver;

public class LoginPage {
	
	LoginPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public WebElement txtUsername;
	public WebElement txtPassword;
	public WebElement btnLogin;

}
