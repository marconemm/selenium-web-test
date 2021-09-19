package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DashBoardPage;
import pageObject.LoginPage;
import utils.Utils;

public class LoginSteps {

    final LoginPage loginPage = Utils.at(LoginPage.class);
    final DashBoardPage dashBoardPage = Utils.at(DashBoardPage.class);

    @When("I inform the user {string}")
    public void iInformTheUser(String username) {
	loginPage.informUsername(username);

    }

    @And("inform the password {string}")
    public void informThePassword(String password) {
	loginPage.informPassword(password);
    }

    @And("click on the login button")
    public void clickOnTheLoginButton() {
	loginPage.clickOnLoginButton();
    }

    @Then("the sistem shows the invalid credentials user message")
    public void theSistemShowsTheInvalidCredentialsUserMessage() {
	boolean result = loginPage.checksSpanMessage();

	assertTrue(result);
    }

    @Then("the system changes to the dashborad page")
    public void theSystemChangesToTheDashboradPage() {
	boolean result = dashBoardPage.getCurrentUrl().contains("/dashboard");

	assertTrue(result);
    }

    @Then("welcomes the user {string}")
    public void welcomesTheUser(String userFirstName) {
	boolean result = dashBoardPage.checksWelcomeLink(userFirstName);

	assertTrue(result);
    }

}
