package leucine.core;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver = null;

	@BeforeSuite
	public void setupSuite() {

		try {
			System.out.println("BEFORE SUITE");

			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");

			String driverPath = System.getProperty("user.dir") + File.separator + "Resources" + File.separator
					+ "Drivers" + File.separator + "chromedriver.exe";

			String chromeDriverProperty = "webdriver.chrome.driver";
			System.setProperty(chromeDriverProperty, driverPath);
			driver = new ChromeDriver();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void setupMethod() {

		System.out.println("BEFORE METHOD");

	}

	@AfterSuite
	public void destroySuite() {
		System.out.println("AFTER METHOD");
	}

	@AfterMethod
	public void destroyMethod() {

		try {

			System.out.println("AFTER SUITE");
			driver.close();
			driver.quit();
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
