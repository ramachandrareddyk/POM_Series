package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	BasePage base;
	Properties prop;
	
	@BeforeMethod
	public void doSetUp() {
		base= new BasePage();
		prop=base.init_Properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
