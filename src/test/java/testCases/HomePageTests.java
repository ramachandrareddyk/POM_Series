package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constents;

public class HomePageTests extends BaseTest{
	
	
	@Test
	public void verifyPageTitleTest() {
	String ActTitle=home.getHomepageTitle();
	
	Assert.assertEquals(ActTitle, Constents.HOME_PAGE_TITLE);
	}
	
	@Test
	public void verifySearchBoxIsDisplay() {
		boolean b= home.isSearchBoxDisplayed();
		
		Assert.assertTrue(b);
	}
	
	@Test
	public void verifySearchButtonIsDisplayed() {
		Assert.assertTrue(home.isSerchButtonDisplayed());
	}
	
	@Test
	public void verifyIsMyaAccountDisplayed() {
		Assert.assertTrue(home.isMyAccountDisplay());
	}
	
	@Test
	public void verifyIsLoginOptionDisplay() {
		home.clickOnMyAccount();
		
		Assert.assertTrue(home.loginIsDisplay());
	}
	
	@Test
	public void verifyRegisterOptionIsDisplay() {
		home.clickOnMyAccount();
		Assert.assertTrue(home.registerIsDisplay());
	}

}
