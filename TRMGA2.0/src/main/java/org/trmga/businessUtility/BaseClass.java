package org.trmga.businessUtility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.trmga.genericUtility.FileUtility;
import org.trmga.genericUtility.WebdriverUtility;
import org.trmga.objectRepository.NinjaLoginPage;

public class BaseClass {
	
	public WebDriver driver = null;
	//create object for utility classes
	public WebdriverUtility wutil = new WebdriverUtility();
	public FileUtility futil = new FileUtility();
    
	
	//POM
	public NinjaLoginPage loginpage;
    
    
    @BeforeMethod
	public void bm() throws IOException {
		
		Reporter.log("before method - login", true);
		//login page 
		//read data from properties
		String username = futil.readDataFromPropertiesFile("username");
		String password = futil.readDataFromPropertiesFile("password");
		loginpage.loginApplication(username, password);
		
	}

	@AfterMethod
	public void am() {
		
		Reporter.log("after method - logout", true);
		loginpage.logout();
	}
	 
	@BeforeClass
	public void bc() throws IOException {
		Reporter.log("before class- browser", true);
		
		//code fix for change for password leak alert
		ChromeOptions options = new ChromeOptions();

        // Disable password manager & leak detection
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        // This disables password leak detection
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
		
		String BROWSER = futil.readDataFromPropertiesFile("browser");	
		String url = futil.readDataFromPropertiesFile("url");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new EdgeDriver();
		} else {
			Reporter.log("Invalid Browser Name", true);
		}
		
		loginpage = new NinjaLoginPage(driver);
		
		driver.get(url);
		driver.manage().window().maximize();
		wutil.toImplicitlywait(driver, 5);
		
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("after class- close browser", true);
		driver.quit();
	}
	

}
