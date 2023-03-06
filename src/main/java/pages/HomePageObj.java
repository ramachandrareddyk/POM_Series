package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class HomePageObj extends BasePage{
	
	WebDriver driver;
	ElementUtilities utils;
	
	public HomePageObj(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	// By Locaters
	
	By SerachBox= By.name("search");
	
	By SearchButton= By.xpath("//button[@class='btn btn-default btn-lg']");
	
	By cart=By.id("cart");
	
	By currency= By.xpath("//span[text()='Currency']");
	
	By MyACcount= By.xpath("//span[text()='My Account']");
	
	By Register = By.xpath("//a[text()='Register']");
	
	By Login =By.xpath("//a[text()='Login']");
			
	
	//Action methods
	public String getHomepageTitle() {
		return utils.getPageTitle();
	}
	
	public boolean isSearchBoxDisplayed() {
		return utils.isElementDisplay(SerachBox);
	}
	
	public void enterTextInSearchBox(String value) {
		utils.doSendKeys(SerachBox, value);
	}
	
	public void clickOnSearchButton() {
		utils.doClick(SearchButton);
	}
	
	public boolean isSerchButtonDisplayed() {
		return utils.isElementDisplay(SearchButton);
	}
	
	public boolean isMyAccountDisplay() {
		return utils.isElementDisplay(MyACcount);
	}
	
	public void clickOnMyAccount() {
		utils.doClick(MyACcount);
	}
	
	public void clickOnRegister() {
		utils.doClick(Register);
	}
	
	public void clcikOnLogin() {
		utils.doClick(Login);
	}
	
	public boolean registerIsDisplay() {
		return utils.isElementDisplay(Register);
	}
	
	public boolean loginIsDisplay() {
		return utils.isElementDisplay(Login);
	}

}
