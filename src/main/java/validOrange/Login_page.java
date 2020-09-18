package validOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page {
	WebDriver driver;

	public Login_page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@name='Submit']")
	WebElement clickSubmitButton;

	public void username(String name) {
		Username.sendKeys(name);
	}

	public void password(String word) {
		Password.sendKeys(word);
	}

	public void Submit() {
		clickSubmitButton.click();

	}

}
