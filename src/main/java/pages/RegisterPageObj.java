package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import net.bytebuddy.asm.Advice.Return;
import utilities.ElementUtilities;

public class RegisterPageObj extends BasePage{
	
	WebDriver driver;
	ElementUtilities utils;
	
	public RegisterPageObj(WebDriver driver) {
		this.driver= driver;
		
		utils= new ElementUtilities(driver);
	}
	
	//WebElements
	
	By RegisterPageHeader= By.xpath("//h1[text()='Register Account']");
	
	By FirstNameTextBox= By.id("input-firstname");
	
	By LastNameTextBox=By.id("input-lastname");
	
	By EmailTextBox= By.id("input-email");
	
	By TelephoneTextBox =By.id("input-telephone");
	
	By PasswordTextBox= By.id("input-password");
	
	By ConformPasswordTextBox=By.id("input-confirm");
	
	By SbscribeYes=By.xpath("//label[normalize-space()='Yes']");
	
	By SuscribeNo=By.xpath("//label[normalize-space()='No']");
	
	By PrivacyPolacy =By.name("agree");
	
	By ContinueBtn = By.xpath("//input[@value='Continue']");
			
	
	
	//Action Methods
	public String getRegisterPageTitle() {
		return utils.getPageTitle();
	}
	
	public boolean registerPageHeaderExist() {
		return utils.isElementDisplay(RegisterPageHeader);
	}
	
	public String registerPageHeaderText() {
		return utils.getElementText(RegisterPageHeader);
	}
	
	public void Register(String firstName, String lastName,String Email, String MobileNum, String Password, String Subscribe ) {
		utils.doSendKeys(FirstNameTextBox, firstName);
		
		utils.doSendKeys(LastNameTextBox, lastName);
		
		utils.doSendKeys(EmailTextBox, Email);
		
		utils.doSendKeys(TelephoneTextBox, MobileNum);
		
		utils.doSendKeys(PasswordTextBox, Password);
		
		utils.doSendKeys(ConformPasswordTextBox, Password);
		
		if(Subscribe.equalsIgnoreCase("yes")) {
			utils.doClick(SbscribeYes);
		}else {
			utils.doClick(SuscribeNo);
		}
		
		utils.doClick(PrivacyPolacy);
		
		utils.doClick(ContinueBtn);
		
	}

}
