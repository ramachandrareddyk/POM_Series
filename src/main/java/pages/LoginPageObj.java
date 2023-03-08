package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class LoginPageObj extends BasePage{
	WebDriver driver;
	ElementUtilities utils;
	
	public LoginPageObj(WebDriver driver) {
		this.driver= driver;
		
		utils= new ElementUtilities(driver);
	}
	
	By NewCustomerHeader= By.xpath("//h2[text()='New Customer']");
	
	By ContinueBtn= By.xpath("//a[text()='Continue']");
	
	By ReturningCustomer= By.xpath("//h2[text()='Returning Customer']");
	
	By EmailIdLabel= By.xpath("//label[text()='E-Mail Address']");
	
	By PasswordLabel= By.xpath("//label[text()='Password']");
	
	By EmailidTextBox= By.id("input-email");
	
	By PasswordTextBox= By.id("input-password");
	
	By ForgetPassword=By.xpath("//a[text()='Forgotten Password']");
	
	By loginButton =By.xpath("//input[@type='submit']");
	
	By LoginWarningMessage=By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
	
	
	
	public String getLoginPageTitle() {
		return utils.getPageTitle();
	}
	
	public boolean newCustomerHeaderIsExist() {
		return utils.isElementDisplay(NewCustomerHeader);
	}
	
	public boolean continueButtonExist() {
		return utils.isElementDisplay(ContinueBtn);
	}
	
	public boolean returningCustomerHeaderExist() {
		return utils.isElementDisplay(ReturningCustomer);
	}
	
	public boolean usernamelabelExist() {
		return utils.isElementDisplay(EmailIdLabel);
	}
	
	public boolean passwordlabelExist() {
		return utils.isElementDisplay(PasswordLabel);
	}
	
	public boolean usernameTextBoxExist() {
		return utils.isElementDisplay(EmailidTextBox);
	}
	
	public boolean passwordTextBoxExist() {
		return utils.isElementDisplay(PasswordTextBox);
	}
	
	public boolean forgetPassword() {
		return utils.isElementDisplay(ForgetPassword);
	}
	
	public boolean loginButton() {
		return utils.isElementDisplay(loginButton);
	}
	
	public void login(String username, String Password) {
		
		utils.doSendKeys(EmailidTextBox, username);
		
		utils.doSendKeys(PasswordTextBox, Password);
		
		utils.doClick(loginButton);
	}
	
	public boolean loginWarningMessageIsExist() {
		return utils.isElementDisplay(LoginWarningMessage);
	}

}
