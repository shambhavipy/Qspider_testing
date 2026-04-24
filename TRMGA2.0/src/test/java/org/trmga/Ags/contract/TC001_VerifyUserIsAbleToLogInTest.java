package org.trmga.Ags.contract;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.trmga.genericUtility.FileUtility;
import org.trmga.genericUtility.WebdriverUtility;
import org.trmga.objectRepository.LoginPage;

public class TC001_VerifyUserIsAbleToLogInTest {

	
//////////////////////////////
	@Test
	public void tC001_VerifUserIsAbleToCreateContractTest() throws IOException {
		// TODO Auto-generated method stub
		
		//create object
		WebdriverUtility wUtil = new WebdriverUtility();
        FileUtility fUtil = new FileUtility();
        
        //read data to launch URL and read data for username & password
        String Url = fUtil.readDataFromPropertiesFile("url");
        String Username = fUtil.readDataFromPropertiesFile("username");
        String Password = fUtil.readDataFromPropertiesFile("password");
        
        //launch browser
        WebDriver driver = new ChromeDriver();
        
        //get chromedriver
        driver.get(Url);
        
        //maximize browser
        wUtil.toMaximize(driver);
        
        //implicit wait
        wUtil.toImplicitlywait(driver, 2);
        
        //create object for login object repo
        	LoginPage loginP = new LoginPage(driver);
    		loginP.loginApplication(Username, Password);
    		loginP.SignInButton();
    		
	}
}
