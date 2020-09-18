package validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BasePage;
import validOrange.Browser;
import validOrange.Login_page;

public class Test_Orange {
	WebDriver driver;
	Validation valid;
	Login_page page;


	@Test
	public void LoginPage() {
		driver = Browser.launch();
		page = PageFactory.initElements(driver, Login_page.class);
		page.username("Admin");
		page.password("admin123");
		BasePage.takeSnapshot(driver, "LoginPageLunch");
		page.Submit();
		driver.quit();
	}
	
	//@Test
	public void Orange_test() {
		valid = PageFactory.initElements(driver, Validation.class);
		valid.validatebrowser();
	}

}
