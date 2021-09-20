package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DashBoardPage;
import utils.Utils;

public class DashBoardSteps {

    final DashBoardPage dashBoardPage = Utils.at(DashBoardPage.class);

    @And("click on admin menu")
    public void clickOnAdminMenu() {
	dashBoardPage.selectAdminPanel();
    }

    @Then("checks if the user {string} exists and delete him")
    public void checksIfTheUserExistsAndDeleteHim(String username) {
	dashBoardPage.setUserCBoxEl(username);
	dashBoardPage.selectCBoxUser();
	dashBoardPage.clickOnBtnDelete();
	dashBoardPage.deleteUser();
    }

    @And("click on add button")
    public void clickOnAddButton() {
	dashBoardPage.clickOnAddBtn();
    }

    @Then("inform the employername {string}")
    public void informTheEmployername(String empName) {
	dashBoardPage.informEmpName(empName);
    }

    @And("inform the username {string}")
    public void informTheUsername(String username) {
	dashBoardPage.informUsername(username);
    }

    @And("inform the new user password {string}")
    public void informTheNewUserPassword(String password) {
	dashBoardPage.informPassword(password);
    }

    @And("confirm the new user password {string}")
    public void confirmTheNewUserPassword(String confirmedPassword) {
	dashBoardPage.informTheConfirmedPassword(confirmedPassword);
    }

    @When("click on save button")
    public void clickOnSaveButton() {
	try {
		Thread.sleep(1000);
		dashBoardPage.clickOnSaveBtn();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

    }

    @Then("The system shows the username {string} into System Users list")
    public void theSystemShowsTheUserIntoSystemUsersList(String username) {
	boolean result = dashBoardPage.checkIfTheUserWasCreated(username);
	
	assertTrue(result);

    }
}
