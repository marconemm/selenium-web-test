package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class BasicLoggedInPage {

    final WebDriver driver = Utils.driver;

    @FindBy(partialLinkText = "Welcome")
    private WebElement welcomeLinkEl;

    public String getCurrentUrl() {

	return driver.getCurrentUrl();
    }

    public boolean checksWelcomeLink(String greeting) {

	String linkTxt = welcomeLinkEl.getText();

	return linkTxt.contains(greeting);
    }

}
