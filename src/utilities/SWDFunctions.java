package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SWDFunctions {
	
	public WebDriver driver;
	
	public void typeByXpath (String locator, String value){
		driver.findElement (By.xpath(locator)).sendKeys (value);
	}
	public void typeByCss(String locator, String value){
		driver.findElement (By.cssSelector(locator)).sendKeys (value);
	}
	public void typeById(String locator, String value){
		driver.findElement (By.id(locator)).sendKeys (value);
	}
	
	public void clickByXpath (String locator){
		driver.findElement(By.xpath (locator)).click();
	}
}
