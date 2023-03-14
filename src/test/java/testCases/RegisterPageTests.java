package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constents;
import utilities.ExcelUtilities;

public class RegisterPageTests extends BaseTest {

	@Test
	public void verifyRegisterPageTitle() {
		home.clickOnMyAccount();

		home.clickOnRegister();

		Assert.assertEquals(register.getRegisterPageTitle(), Constents.REGISTER_PAGE_TITLE);
	}

	@Test
	public void verifyRegisterPageHeaderExist() {
		home.clickOnMyAccount();

		home.clickOnRegister();
		
		Assert.assertTrue(register.registerPageHeaderExist());
	}
	
	@Test
	public void verifyRegisterPageHeaderText() {
		home.clickOnMyAccount();

		home.clickOnRegister();
		
		Assert.assertEquals(register.registerPageHeaderText(), Constents.REGISTER_PAGE_TITLE);
	}
	
	@DataProvider
	public Object[][] getTestData() {
		return ExcelUtilities.getTestData("TestData");
	}
	
	
	@Test(dataProvider ="getTestData" )
	public void verifyUserRegistration(String FirstName, String LastName, String Email, String Teliphone, String Password, String Subscribe) {
		home.clickOnMyAccount();

		home.clickOnRegister();
		
		register.Register(FirstName,LastName, Email,Teliphone, Password,Subscribe);
		
		Assert.assertEquals(success.getAccountCreationSuccessPageTitle(), Constents.ACCOUNT_CREATION_SUCCESS_PAGE_TITLE);
	}
	

}
