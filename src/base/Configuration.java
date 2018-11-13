package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utilities.SWDFunctions;

	public class Configuration extends SWDFunctions {

		@BeforeTest
		public void beforeTestStart(){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
		}

}
