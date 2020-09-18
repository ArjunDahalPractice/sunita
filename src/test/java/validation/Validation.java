package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Util.BasePage;
import validOrange.Browser;

public class Validation {
	WebDriver driver;

	public Validation(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void validatebrowser() {
		driver = Browser.launch();
		String Expected_Browser_Tile = "OrangeHRM";
		Assert.assertTrue((driver.getTitle()).contains(Expected_Browser_Tile), "correct page");
		
		WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		String forgotActualPassword = forgotPassword.getText();
		
		String expected = "Forgot your password?";
		BasePage.Assertion("Forgot Password is Missing", expected, forgotActualPassword);
	}	
}