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

}
