package org.trmga.Ags.contract;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.trmga.businessUtility.BaseClass;

public class ConfigurationAnnotationDemo extends BaseClass { 
	
	@Test
	public void login() throws InterruptedException  {
		Reporter.log("login", true);
		
		//create campaign
		loginpage.getCreateCampaign().click();
		Thread.sleep(5000);
		loginpage.CreateCampaignWithMandatoryFields("12345", "WomenPower" ,"Passed", "Women", 100);
		
	}
}

