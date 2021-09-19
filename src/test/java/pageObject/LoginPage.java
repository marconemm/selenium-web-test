package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    
    @FindBy(id = "txtUsername")
    private WebElement inputUsernameEl;
    
    @FindBy(id = "txtPassword")
    private WebElement inputPasswordEl;
    
    @FindBy(id = "btnLogin")
    private WebElement btnLoginEl;
    
    @FindBy(id = "spanMessage")
    private WebElement spnMsgEl;

    public void informUsername(String username) {

	inputUsernameEl.sendKeys(username);

    }

    public void informPassword(String password) {
	
	inputPasswordEl.sendKeys(password);

    }

    public void clickOnLoginButton() {

	btnLoginEl.click();

    }
    
    public boolean checksSpanMessage() {
	String spanTxt = spnMsgEl.getText();
	
	return spanTxt.equals("Invalid credentials");
    }
    

}
