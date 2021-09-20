package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;

public class Utils {

    public static WebDriver driver;

    public static void openTheSystem() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	driver.manage().timeouts().pageLoadTimeout(3500, TimeUnit.MILLISECONDS);
	driver.manage().timeouts().setScriptTimeout(500, TimeUnit.MILLISECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    public static <T> T at(Class<T> curClass) {
	return PageFactory.initElements(driver, curClass);
    }
    
    public static void takeScreenShot(Scenario scenario) {
	final byte[] sreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(sreenShot, "image/png", "Cucumber screenshot");	
    }

}
