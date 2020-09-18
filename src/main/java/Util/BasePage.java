package Util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public static void Assertion(String Message, String expected, String Actual) {
		if (!Actual.equalsIgnoreCase(expected)) {
			throw new RuntimeException(Message);
		}

	}

	public static void takeSnapshot(WebDriver driver, String nameOfScreenShot) {
		DateFormat dateFormate = new SimpleDateFormat("dd-MMM-yyyy HH-MM-SS");
		Date date = new Date();
		String timestamp = dateFormate.format(date);

		TakesScreenshot takeScreenshot = ((TakesScreenshot) driver);
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);

		File file = new File(".\\snapshot");
		if (!file.exists())
			file.mkdir();
		try {
			FileUtils.copyFile(source, new File(".\\snapshot\\snap"+ nameOfScreenShot + timestamp + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}
}
