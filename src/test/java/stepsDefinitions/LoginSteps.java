package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a;
import pageObject.DashBoardPage;
import pageObject.LoginPage;

public class LoginSteps {

    final LoginPage loginPage = new LoginPage();
    final DashBoardPage dashBoardPage = new DashBoardPage();

    @When("I inform the user {string}")
    public void iInformTheUser(String username) {
	loginPage.informUsername(username);
    }

    @When("inform the password {string}")
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

    @Then("the sistem log into dashboad")
    public void theSistemLogIntoDashboad() {

    }

    @Then("the system changes to the dashborad page")
    public void theSystemChangesToTheDashboradPage() {
	assertTrue(dashBoardPage.getCurrentUrl().contains("/dashboard"));
    }

    @Then("welcomes the user {string}")
    public void welcomesTheUser(String userFirstName) {
	assertTrue(dashBoardPage.checksWelcomeLink(userFirstName));
    }

}
