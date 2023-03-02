package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class ElementUtilities extends BasePage{
	
	WebDriver driver;
	
	public ElementUtilities(WebDriver driver) {
		this.driver=driver;
	}
	
	//get WebElement
	public WebElement getWebElement(By Locater) {
		WebElement element= driver.findElement(Locater);

		return element;
	}
	
	//Do Click
	public void doClick(By Locater) {
		getWebElement(Locater).click();
	}
	
	//Do SendKeys
	public void doSendKeys(By Locater, String value) {
		getWebElement(Locater).sendKeys(value);
	}
	
	//Get Page Title
	public String getPageTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	//Get Text
	public String getElementText(By Locater) {
		String Text=getWebElement(Locater).getText();
		return Text;
	}
	
	//Get Attribute
	public String getElementAttribute(By Locater, String value) {
		String AttributeValue=getWebElement(Locater).getAttribute(value);
		
		return AttributeValue;
	}
	
	//Element display
	public boolean isElementDisplay(By Locater) {
		boolean b= getWebElement(Locater).isDisplayed();
		
		return b;
	}
	
	//Element Enabled
	public boolean isElementEnable(By locater) {
		boolean b=getWebElement(locater).isEnabled();
		
		return b;
	}
	
	//get WebElements
	public List<WebElement> getWebElements(By Locater) {
		List<WebElement>elements= driver.findElements(Locater);
		
		return elements;
	}
	
	// do alert accept
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

	// do alert accept
	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	//select value in dropdown based on select by visable text
	public void selectValueByVisableText(By locater, String value) {
		WebElement element= getWebElement(locater);
		
		Select sel= new Select(element);
		sel.selectByVisibleText(value);
	}
	//select value in dropdown based on select by index
		public void selectValueByIndex(By locater, int index) {
			WebElement element= getWebElement(locater);
			
			Select sel= new Select(element);
			sel.selectByIndex(index);
		}
		
	//Select value in dropdown by Select value method
	
	//do alert close
		
	//get text from alert
		
	//Enter text into alert
	
	//do click with Action class
	
	//Do Sendkeys with action class
	
	//Do Right click
		
	//Do Double click
		
	//do Mouse over
		
	//do Drag and Drop
		
	//handle multiple windows
		
	//handle multiple tabs
	
	
	
	

}
