package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.AccountCreationSuccessPageObj;
import pages.HomePageObj;
import pages.LoginPageObj;
import pages.MyAccountPageObj;
import pages.RegisterPageObj;

public class BaseTest {
	public WebDriver driver;
	public BasePage base;
	public Properties prop;
	public HomePageObj home;
	public LoginPageObj login;
	public MyAccountPageObj myaccount;
	public RegisterPageObj register;
	public AccountCreationSuccessPageObj success;
	
	@BeforeMethod
	public void doSetUp() {
		base= new BasePage();
		prop=base.init_Properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		home= new HomePageObj(driver);
		login= new LoginPageObj(driver);
		myaccount= new MyAccountPageObj(driver);
		register= new RegisterPageObj(driver);
		success= new AccountCreationSuccessPageObj(driver);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
