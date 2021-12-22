package leucine.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import leucine.core.Base;
import leucine.utilities.Utilities;
public class Dbeaver extends Base{

	
	@Test
	public void registerOnSite() {
		PageElements oPageElements = new PageElements();
		try {
			String siteURL = Utilities.getConfigProperty("url");
			driver.get(siteURL);
			Thread.sleep(2000);
			
			
			Actions action = new Actions(driver);
			action.moveToElement(oPageElements.navSignInButton).perform();
			Thread.sleep(2000);
			
			// Click on Sign Up Button
			oPageElements.navEleSignUpButton.click();
			
			// Validate Sign Up page
			int waitCount = 4;
			while (waitCount > 0) {
				if (driver.getTitle().equals("Sign up – DBeaver")) {
					break;
				} else {
					Thread.sleep(1000);
				}

				waitCount--;
			}			
			
			// Enter Details
			oPageElements.signInForm_email.click();
			oPageElements.signInForm_email.sendKeys(Utilities.getConfigProperty("email"));

			oPageElements.signInForm_password.click();
			oPageElements.signInForm_password.sendKeys(Utilities.getConfigProperty("password"));

			oPageElements.signInForm_confirmPassword.click();
			oPageElements.signInForm_confirmPassword.sendKeys(Utilities.getConfigProperty("password"));

			oPageElements.signInForm_firstName.click();
			oPageElements.signInForm_firstName.sendKeys(Utilities.getConfigProperty("firstName"));

			oPageElements.signInForm_lastName.click();
			oPageElements.signInForm_lastName.sendKeys(Utilities.getConfigProperty("lastName"));

			// Click Submit
			oPageElements.signInForm_submitButton.click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
