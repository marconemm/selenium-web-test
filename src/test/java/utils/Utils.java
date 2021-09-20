package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {

    public static WebDriver driver;

    public static void openTheSystem() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//	driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.MILLISECONDS);
//	driver.manage().timeouts().setScriptTimeout(4000, TimeUnit.MILLISECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    public static <T> T at(Class<T> curClass) {
	return PageFactory.initElements(driver, curClass);
    }

}
