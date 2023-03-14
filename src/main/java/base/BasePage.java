package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	static WebDriver driver;
	Properties prop;
	
	public WebDriver init_Browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			driver= new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			
			driver= new InternetExplorerDriver();
		} else if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.safaridriver().setup();
			
			driver= new SafariDriver();
		}else {
			System.out.println("Plese pass the correct browser name");
		}
		
		return driver;
	}
	
	
	public Properties init_Properties() {
		prop= new Properties();
		String filePath="C:\\Users\\Gopi\\eclipse-workspace\\POM_Series_Feb_2023\\src\\main\\java\\congigProperties\\Config.properties";
		
		try {
			FileInputStream ip= new FileInputStream(filePath);
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static String getScreenshot() {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileHandler.copy(srcFile, destination);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;

	}

}


