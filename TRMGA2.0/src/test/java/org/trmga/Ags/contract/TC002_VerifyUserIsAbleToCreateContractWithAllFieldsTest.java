package org.trmga.Ags.contract;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.trmga.genericUtility.FileUtility;
import org.trmga.genericUtility.WebdriverUtility;
import org.trmga.objectRepository.LoginPage;

public class TC002_VerifyUserIsAbleToCreateContractWithAllFieldsTest {
	
	@Test
	public void tC002_VerifyUserIsAbleToCreateContractWithAllFieldsTest() throws IOException, InterruptedException {
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
        
      //maximize browser
        wUtil.toMaximize(driver);
        
        //implicit wait
        wUtil.toImplicitlywait(driver, 4);
       // wUtil.toWaitExplicitly(driver, 7).until(ExpectedConditions.visibil)
        
      //get chromedriver
        driver.get(Url);
        
      //wait
		Thread.sleep(2000);
        
        //create object for login object repo
        	LoginPage loginP = new LoginPage(driver);
    		loginP.loginApplication(Username, Password);
    		loginP.SignInButton();
    		
    		//wait
    		Thread.sleep(2000);
    		
    		//create object for LoginPage
    		LoginPage login = new LoginPage(driver);
    		
    		//wait
    		Thread.sleep(3000);  		
    		login.PhysicalTrades();
    		
    		//wait
    		Thread.sleep(3000);
    		
    		//Transfer the condtrol	
    		wUtil.driverControl(driver, "Physical");
    		
    		//wait
    		Thread.sleep(5000);
    	
    		login.getHamburgerMenu().click();
    		wUtil.toMouseHoverbyElement(driver, login.getOilMouseHover());    		
    		login.getNewContractOptionClick().click();
    		
    		//wait
    		Thread.sleep(2000);
    		
    		wUtil.toSelectbyVisibleText(login.getThirdParty(), "Third Party");
    		wUtil.toSelectbyVisibleText(login.getContractTypeDropdown() , "Purchase");
    		
    		Thread.sleep(5000);
    		wUtil.toSelectbyIndex(login.getCPnameDropdown(), 4);
    		wUtil.toSelectbyVisibleText(login.getFinalPaymentTermsDropdown(), "15 days after Title Transfer Date");
    		wUtil.toSelectbyIndex(login.getProvisionalTermsDropdown(), 4);
    		wUtil.toSelectbyIndex(login.getApplicableLawDropdown(), 2);
    		wUtil.toSelectbyIndex(login.getArbitrationDropdown(), 5);
    		wUtil.toScrollToElement(driver, driver.findElement(By.xpath("//label[text()='Legal Entity']")));
    		wUtil.toSelectbyIndex(login.getLegalEntity(), 1);
    		wUtil.toSelectbyVisibleText(login.getIncoTerm(), "CIF");
    		wUtil.toSelectbyVisibleText(login.getContractQtyUnit(), "BBL");	
    		login.getRemark().sendKeys("New Contract Creation");
    		
    		Thread.sleep(5000); 		
    		login.getSaveButton().click();
    		
    		Thread.sleep(8000);
    		
    		
    		
	}
}
