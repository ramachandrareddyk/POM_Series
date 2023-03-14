package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class AccountCreationSuccessPageObj extends BasePage{

	WebDriver driver;
	ElementUtilities utils;
	
	public AccountCreationSuccessPageObj(WebDriver driver) {
		this.driver=driver;
		
		utils= new ElementUtilities(driver);
	}
	
	
	
	public String getAccountCreationSuccessPageTitle() {
		return utils.getPageTitle();
	}
	
	
}
