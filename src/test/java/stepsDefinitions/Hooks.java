package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

    @Before(value = "@login")
    public void setUp() {
	Utils.openTheSystem();

    }

    @Before(value = "@registerUser")
    public void makeSingIn() {
	Utils.openTheSystem();
	LoginSteps loginSteps = new LoginSteps();

	loginSteps.makeSingIn("Admin", "admin123", "Welcome");

    }

    @After
    public void tearDown() {
	Utils.driver.quit();
    }

}
