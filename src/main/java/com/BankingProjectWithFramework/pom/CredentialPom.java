package com.BankingProjectWithFramework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankingProjectWithFramework.base.BaseClass;

public class CredentialPom extends BaseClass {
	public CredentialPom() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//table[@border ='1']/tbody/tr[4]/td[2]")
	WebElement userid ;
	@FindBy(xpath = "//table[@border ='1']/tbody/tr[5]/td[2]")
	WebElement password;
	public void saveCredential() {
		String usreId=userid.getText();
		String Password=password.getText();
		
	}
	
	  

}
