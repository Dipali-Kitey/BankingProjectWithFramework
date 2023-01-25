package com.BankingProjectWithFramework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankingProjectWithFramework.base.BaseClass;

public class LoginpagePom extends BaseClass {
	public LoginpagePom() {
		PageFactory.initElements(driver, this);
	  
	}
	@FindBy(xpath = "//input[@name='uid']")
	WebElement userid;
	@FindBy(xpath ="//input[@name='password']" )
	WebElement password;
	@FindBy(xpath ="//input[@name='btnLogin']" )
	WebElement loginbutton;
	@FindBy(xpath = "//input[@name='btnReset']")
	WebElement resetbutton;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/'] ")
	WebElement getcredentiallink;
	public void clickonloginbutton() {
		
		loginbutton.click();
	}
	public BankHomepagePom
	clickOnGetCredential(){
		 getcredentiallink.click();
		return new BankHomePagePom();
	}
	
	
		
	
	
}
	



