package com.BankingProjectWithFramework.loginpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BankingProjectWithFramework.base.BaseClass;
import com.BankingProjectWithFramework.pom.BankHomepagePom;
import com.BankingProjectWithFramework.pom.CredentialPom;
import com.BankingProjectWithFramework.pom.LoginpagePom;
import com.BankingProjectWithFramework.utility.Utility;

public class HomePageTest extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	
	
    @Test
	public void testGetcredential() throws EncryptedDocumentException, IOException {
		LoginpagePom loginpagepom = new LoginpagePom();
		 BankHomepagePom bankhomepage = loginpagepom.clickOnGetCredential();
		 Utility utility = new Utility();
		 String email =(String) utility.getSingleCellDataFromExcel(1, 0,"Sheet1");
		 bankhomepage.SetEmailid(email);
		 CredentialPom credentialpom= bankhomepage.ClickonSubmit();
		 credentialpom.saveCredential();
	}
   }
