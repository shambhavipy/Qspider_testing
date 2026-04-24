package org.trmga.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.trmga.genericUtility.FileUtility;

public class NinjaLoginPage {
	@FindBy (xpath = "//input[@id='username']")
	private WebElement Username;
	
	@FindBy (xpath = "//input[@id='inputPassword']")
	private WebElement Password;
	
	@FindBy (xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement SignIn;
	
	@FindBy (xpath = "//span[text()='Create Campaign']")
	private WebElement CreateCampaign;
	
	@FindBy (xpath = "//input[@name='campaignId']")
	private WebElement CampaignID;
	
	@FindBy(xpath = "//input[@type='date']")
	private WebElement ExpectedCloseDate;
	
	@FindBy (xpath = "//input[@name='campaignName']")
	private WebElement CampaignName;
	
	@FindBy (xpath = "//input[@name='targetAudience']")
	private WebElement TargetAudience;
	
	@FindBy (xpath = "//input[@name='campaignStatus']")
	private WebElement CampaignStatus;
	
	@FindBy (xpath= "//label[text()='Description:']/following-sibling::textarea")
	private WebElement Description;
	
	@FindBy (xpath = "//input[@type='number']")
	private WebElement TargetSize;
	
	@FindBy (xpath = "//button[text()='Create Campaign']")
	private WebElement CreateCampaignButton;
	
	@FindBy (xpath = "//*[name()='svg']")
	private WebElement UserIcon;
	
	@FindBy (xpath = "//div[@class='dropdown-item logout']")
	private WebElement Logout;
	
	//initialiazation
	public NinjaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsername() {
		return Username;
	}
	

//	public void setUsername(WebElement username) {
//		Username = username;
//	}

	public WebElement getPassword() {
		return Password;
	}

//	public void setPassword(WebElement password) {
//		Password = password;
//	}
	
	public void loginApplication(String username, String password) {
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		SignIn.click();
		
	}
	
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getCreateCampaign() {
		return CreateCampaign;
	}

	public WebElement getCampaignID() {
		return CampaignID;
	}

	public WebElement getExpectedCloseDate() {
		return ExpectedCloseDate;
	}

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public WebElement getTargetAudience() {
		return TargetAudience;
	}

	public WebElement getCampaignStatus() {
		return CampaignStatus;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getTargetSize() {
		return TargetSize;
	}

	public WebElement getCreateCampaignButton() {
		return CreateCampaignButton;
	}

	public void CreateCampaign() {
		CreateCampaign.click();
	}
	
	public void  CampaignID(String ID) {
		CampaignID.sendKeys("qwerty1234");
	}
	
	public void ExpectedCloseDate() {
		ExpectedCloseDate.click();
	}
	
	FileUtility futil = new FileUtility();
	
	
	public void logout()
	{
		UserIcon.click();
		Logout.click();
	}
	
	public void CreateCampaignWithMandatoryFields(String ID, String Name, String Status,String Audience,long targetsize) {
		CampaignID.sendKeys(ID);
		CampaignName.sendKeys(Name);
		CampaignStatus.sendKeys(Status);
		TargetAudience.sendKeys(Audience);
		TargetSize.sendKeys("targetsize");
	}
	
	
	
}
