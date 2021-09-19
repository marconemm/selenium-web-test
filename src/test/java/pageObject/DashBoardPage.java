package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Utils;

public class DashBoardPage {

    final WebDriver driver = Utils.driver;
    
    public String getCurrentUrl() {
	
	return driver.getCurrentUrl();
    }

    public boolean checksWelcomeLink(String userFirstName) {
	

	String linkTxt = driver.findElement(By.id("welcome")).getText();

	return linkTxt.equals("Welcome " + userFirstName);
    }

}
