package test_fbLogin;

import locators.FB_Login_Locator;
import org.testng.annotations.Test;
import values.FB_Login_Values;
import base.Configuration;

public class TC1_LoginWithInvalidPassword extends Configuration{
	
	FB_Login_Locator logIn = new FB_Login_Locator();
	FB_Login_Values logInInfo = new FB_Login_Values();
	
	@Test
	public void fbLoginWithInvalidPassword(){
		
		typeByXpath (logIn.emailOrPhone, logInInfo.mobileEmail_value);
		typeByXpath (logIn.password, logInInfo.invalidPassword_value);
		clickByXpath (logIn.loginButton);
		
		driver.quit();
		
		// Assertion! -> Verify if user able to see invalid in line validation error message!!!
		
	}

}
