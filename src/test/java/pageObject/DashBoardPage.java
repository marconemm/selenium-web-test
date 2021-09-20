package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

public class DashBoardPage extends BasicLoggedInPage {

    final private WebDriver driver = Utils.driver;

    @FindBy(name = "btnAdd")
    private WebElement btnAddEl;

    @FindBy(name = "btnDelete")
    private WebElement btnDelEl;

    @FindBy(name = "systemUser[employeeName][empName]")
    private WebElement empNameEl;

    @FindBy(name = "systemUser[userName]")
    private WebElement userNameEl;

    @FindBy(name = "systemUser[password]")
    private WebElement passwrodEl;

    @FindBy(name = "systemUser[confirmPassword]")
    private WebElement confirmPasswordEl;

    @FindBy(name = "btnSave")
    private WebElement btnSaveEl;

    private WebElement userCBoxEl;

    public void setUserCBoxEl(String username) {
	try {
	    final WebElement userLinkEl = driver
		    .findElement(By.xpath("//td[@class='left']/a[text()='" + username + "']"));
	    final String[] userHref = userLinkEl.getAttribute("href").split("=");
	    final int userId = Integer.parseInt(userHref[1]);

	    userCBoxEl = driver.findElement(By.xpath("//input[@value='" + userId + "']"));

	} catch (NoSuchElementException nse) {
	    
	    return;
	}
    }

    public void selectCBoxUser() {
	userCBoxEl.click();
    }

    public void clickOnBtnDelete() {
	btnDelEl.click();
    }

    public void deleteUser() {
	final WebElement bntOkEl = driver.findElement(By.id("dialogDeleteBtn"));
	bntOkEl.click();
    }   

    public void clickOnAddBtn() {
	btnAddEl.click();
    }

    public void informEmpName(String empName) {
	empNameEl.sendKeys(empName);
    }

    public void informUsername(String username) {
	userNameEl.sendKeys(username);
    }

    public void informPassword(String password) {
	passwrodEl.sendKeys(password);
    }

    public void informTheConfirmedPassword(String confirmedPassword) {
	confirmPasswordEl.sendKeys(confirmedPassword);
    }

    public void clickOnSaveBtn() {
	btnSaveEl.click();	
    }

    public boolean checkIfTheUserWasCreated(String username) {
	final WebElement userLink = driver.findElement(By.linkText(username));

	return userLink.isDisplayed();
    }

}
