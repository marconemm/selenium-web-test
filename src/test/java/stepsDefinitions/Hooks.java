package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;

public class Hooks {

    @Before
    public void setUp() {
	Utils.openTheSystem();

    }
    
    @Before (value = "not @login")
    public void registerMakeSingIn() {
	signIn();
    }

    @After
    public void tearDown(Scenario scenario) {
	Utils.takeScreenShot(scenario);	
	Utils.driver.quit();
    }
    
    
    private void signIn() {
	LoginSteps loginSteps = new LoginSteps();

	loginSteps.makeSingIn("Admin", "admin123", "Welcome");

    }

}
