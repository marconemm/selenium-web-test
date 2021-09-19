package pageObject;

import org.openqa.selenium.By;

import utils.Utils;

public class LoginPage {

    public void informUsername(String username) {

	Utils.driver.findElement(By.id("txtUsername")).sendKeys(username);

    }

    public void informPassword(String password) {

	Utils.driver.findElement(By.id("txtPassword")).sendKeys(password);

    }

    public void clickOnLoginButton() {

	Utils.driver.findElement(By.id("btnLogin")).click();

    }
    
    public boolean checksSpanMessage() {
	String spanTxt = Utils.driver.findElement(By.id("spanMessage")).getText();
	
	return spanTxt.equals("Invalid credentials");
    }
    

}
