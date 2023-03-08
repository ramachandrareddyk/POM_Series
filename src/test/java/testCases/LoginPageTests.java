package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constents;

public class LoginPageTests extends BaseTest{
	
	@Test
	public void verifyLoginPageTitleTest() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		String actTitle=login.getLoginPageTitle();
		
		Assert.assertEquals(actTitle, Constents.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void verifyNewCustomerHeader() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.newCustomerHeaderIsExist());
	}
	@Test
	public void verifyContinueButton() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.continueButtonExist());
	}
	@Test
	public void verifyReturningCustomerHeader() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.returningCustomerHeaderExist());
	}
	@Test
	public void verifyEmailidLabel() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.usernamelabelExist());
	}
	@Test
	public void verifyPasswordLabel() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.passwordlabelExist());
	}
	@Test
	public void verifyUsernameTextBoxExist() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.usernameTextBoxExist());
	}
	@Test
	public void verifypasswordTextBoxExist() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.passwordTextBoxExist());
	}
	@Test
	public void verifyForgetPasswordLinkExist() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.forgetPassword());
	}
	@Test
	public void verifyLoginButtonExist() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		Assert.assertTrue(login.loginButton());
	}
	
	@Test
	public void verifySuccesfulLoginWithValidUsernameAndValidPassword() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		login.login(prop.getProperty("ValidUsername"), prop.getProperty("ValidPassword"));
		String ActTitle=myaccount.getMyAccountPageTitle();
		Assert.assertEquals(ActTitle, Constents.MY_ACCOUNT_PAGE_TITLE);
	}
	
	@Test
	public void verifyLoginWithValidUsernameAndInvalidPassword() {
		home.clickOnMyAccount();
		home.clcikOnLogin();
		login.login(prop.getProperty("ValidUsername"), prop.getProperty("InValidPassword"));
		
		Assert.assertTrue(login.loginWarningMessageIsExist());
	}
	
	//invalid username and valid password
	//invalid username and invalid password
	//valid username and password blank
	//invalid username and password blank
	//username blank and valid password
	//username blank and invalid password
	//username blank and password blank





}
