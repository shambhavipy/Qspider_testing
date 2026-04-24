package org.trmga.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.trmga.genericUtility.WebdriverUtility;

public class LoginPage {
			
	//Declaration
	@FindBy (xpath = "//form[@id='formSignIn']//input[1]")
	private WebElement Username;
	
	@FindBy (xpath = "//form[@id='formSignIn']//input[@id='pwd']")
	private WebElement Password;
	
	//Initialization
	@FindBy (xpath = "//button[text()='Sign in']") 
	private WebElement SignInButton;
	
	@FindBy (xpath = "//form[@id='formSignIn']/child::a")
	private WebElement ForgotPassword;
	
	@FindBy (xpath ="//div[text()='Physical Trades' and @class='title-box']")
	private WebElement PhysicalTrades;
	
	@FindBy (id = "button-1097-btnIconEl")
	private WebElement hamburgerMenu;
	
	@FindBy (xpath = "(//a[@class='x-btn button-transparent-bg button-transparent-with-mouseover show-menu-button-right-arrow navigation-menu-button x-unselectable x-box-item x-btn-default-small'])[1]")
	private WebElement OilMouseHover;
	
	@FindBy (xpath=("//span[@id='button-1132-btnEl']/child::span[text()='New Contract']"))
	private WebElement NewContractOptionClick;
	
	public WebElement getNewContractOptionClick() {
		return NewContractOptionClick;
	}

	public WebElement getOilMouseHover() {
		return OilMouseHover;
	}

	public WebElement getPhysicalTrades() {
		return PhysicalTrades;
	}

	public WebElement getHamburgerMenu() {
		return hamburgerMenu;
	}

	public WebElement getOiloption() {
		return Oiloption;
	}

	public WebElement getNewContract() {
		return NewContract;
	}

	
	public WebdriverUtility getWutil() {
		return Wutil;
	}

	@FindBy (xpath = "//span[@id='button-1155-btnEl']")
	private WebElement Oiloption;
	
	@FindBy (xpath = "//span[@id='button-1617-btnInnerEl']")
	private WebElement NewContract;
	
	@FindBy (xpath = "//select[@formcontrolname='dealType']")
	private WebElement DealType;
	
	@FindBy (xpath = "//select[@formcontrolname='dealType']")
	private WebElement ThirdParty;
	
	@FindBy (xpath = "//select[@formcontrolname='contractType']")
	private WebElement ContractTypeDropdown;
	
	@FindBy (xpath = "//select[@formcontrolname='cpProfileId']")
	private WebElement CPnameDropdown;
	
	@FindBy (xpath = "//label[text()='Legal Entity']")
	private WebElement LegalEntityforScroll;
	
	public WebElement getLegalEntityforScroll() {
		return LegalEntityforScroll;
	}
	
	@FindBy (xpath = "//button[@class='btn btn-primary ml-2']")
	private WebElement GeneralDetailsPopUp;

	@FindBy (xpath = "//select[@formcontrolname='applicableLawId']")
	private WebElement ApplicableLawDropdown;
	
	@FindBy (xpath = "//select[@formcontrolname='arbitrationId']")
	private WebElement ArbitrationDropdown;
	
	@FindBy (xpath = "//select[@formcontrolname='paymentTermId']")
	private WebElement FinalPaymentTermsDropdown;
	
	@FindBy (xpath = "//select[@formcontrolname='provisionalPaymentTermId']")
	private WebElement ProvisionalTermsDropdown;
	
	@FindBy (xpath = "//select[@formcontrolname='legalEntityId']")
	private WebElement LegalEntity;
	
	@FindBy (xpath = "//select[@formcontrolname='incotermId']")
	private WebElement IncoTerm;
	
	@FindBy (xpath = "//select[@formcontrolname='totalQtyUnitId']")
	private WebElement ContractQtyUnit;
	
	@FindBy (xpath = "//input[@formcontrolname='remark']")
	private WebElement Remark;
	
	
	
	public WebElement getProvisionalTermsDropdown() {
		return ProvisionalTermsDropdown;
	}

	public WebElement getLegalEntity() {
		return LegalEntity;
	}

	public WebElement getIncoTerm() {
		return IncoTerm;
	}

	public WebElement getContractQtyUnit() {
		return ContractQtyUnit;
	}

	public WebElement getRemark() {
		return Remark;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	@FindBy (xpath = "//button[text()='SAVE']")
	private WebElement SaveButton;
	
	public WebElement getContractTypeDropdown() {
		return ContractTypeDropdown;
	}

	public WebElement getCPnameDropdown() {
		return CPnameDropdown;
	}

	public WebElement getApplicableLawDropdown() {
		return ApplicableLawDropdown;
	}

	public WebElement getArbitrationDropdown() {
		return ArbitrationDropdown;
	}

	public WebElement getFinalPaymentTermsDropdown() {
		return FinalPaymentTermsDropdown;
	}

	public WebElement getSignInButton() {
		return SignInButton;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}

	public WebElement getDealType() {
		return DealType;
	}

	public WebElement getThirdParty() {
		return ThirdParty;
	}

	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void loginApplication(String username, String password) {
		
		Username.sendKeys(username);
		Password.sendKeys(password);	
	}
	
	public void SignInButton() {
		SignInButton.submit();
	}
	
	public void PhysicalTrades() {
		PhysicalTrades.click();
	}
	
	public void SandWichButton() {
		hamburgerMenu.click();
	}
	
	WebdriverUtility Wutil = new WebdriverUtility();


	
	
	
	
	
	
	
	
	

}

