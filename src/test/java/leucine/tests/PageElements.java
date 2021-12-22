package leucine.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import leucine.core.Base;

public class PageElements extends Base {

	PageElements(){
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='uwp-login-button']")
	public WebElement navSignInButton;

	@FindBy(xpath = "//a[@id='uwp-login-button']/parent::li/ul/li/a[text()='Sign up']")
	public WebElement navEleSignUpButton;

	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement signInForm_email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement signInForm_password;

	@FindBy(xpath = "//input[@name=\"confirm_password\"]")
	public WebElement signInForm_confirmPassword;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	public WebElement signInForm_firstName;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	public WebElement signInForm_lastName;

	@FindBy(xpath = "//input[@name=\"uwp_register_submit\"]")
	public WebElement signInForm_submitButton;

}
