package com.BankingProjectWithFramework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class BaseClass {
		public static WebDriver driver;
		public  void launchWebsite() {
		 String projectpath = System.getProperty("user.dir");
		 System.out.println( projectpath);
		 System.setProperty("webdriver.chrome.driver",projectpath+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/V1/index.php");
			

		}
		
		
		
		
		
		
		
		
		
		
		

	}




