package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePageObj;
import pages.LoginPageObj;
import pages.MyAccountPageObj;

public class BaseTest {
	public WebDriver driver;
	public BasePage base;
	public Properties prop;
	public HomePageObj home;
	public LoginPageObj login;
	public MyAccountPageObj myaccount;
	
	@BeforeMethod
	public void doSetUp() {
		base= new BasePage();
		prop=base.init_Properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		home= new HomePageObj(driver);
		login= new LoginPageObj(driver);
		myaccount= new MyAccountPageObj(driver);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
