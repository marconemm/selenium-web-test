package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DashBoardPage;
import utils.Utils;

public class CheckActionsSteps {

    final DashBoardPage dashBoardPage = Utils.at(DashBoardPage.class);

    @When("activete the submenu Custom Fields")
    public void activeteTheSubmenuCustomFields() {
	dashBoardPage.moveThePointerOverPIM();
	dashBoardPage.moveThePointerOverConfiguration();
	dashBoardPage.moveTheMouseOverCustomFields();
    }
    
    @Then("the system shows the Custom Fields page")
    public void theSystemShowsTheCustomFieldsPage() {
        final String curUrl = Utils.driver.getCurrentUrl();
        
        assertTrue(curUrl.contains("/listCustomFields"));
    }
	

}
