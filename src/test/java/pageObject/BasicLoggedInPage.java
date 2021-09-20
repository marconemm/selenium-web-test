package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class BasicLoggedInPage {

    private final WebDriver driver = Utils.driver;
    private final Actions actions = new Actions(driver);

    @FindBy(partialLinkText = "Welcome")
    private WebElement welcomeLinkEl;

    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminLinkEl;

    @FindBy(linkText = "PIM")
    private WebElement pimLinkEl;

    @FindBy(linkText = "Configuration")
    private WebElement configLinkEl;

    @FindBy(linkText = "Custom Fields")
    private WebElement cfLinkEl;

    public String getCurrentUrl() {

	return driver.getCurrentUrl();
    }

    public boolean checksWelcomeLink(String greeting) {

	final String linkTxt = welcomeLinkEl.getText();

	return linkTxt.contains(greeting);
    }

    public void selectAdminPanel() {
	adminLinkEl.click();
    }

    public void moveThePointerOverPIM() {
	actions.moveToElement(pimLinkEl).build().perform();
    }

    public void moveThePointerOverConfiguration() {
	actions.moveToElement(configLinkEl).build().perform();
    }

    public void moveTheMouseOverCustomFields() {
	actions.moveToElement(cfLinkEl).build().perform();
	cfLinkEl.click();
    }

}
