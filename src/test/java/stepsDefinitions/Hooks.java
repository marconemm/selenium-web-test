package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

    @Before
    public void setUp() {
	Utils.openTheSystem();

    }
    
    @Before (value = "@registerUser")
    public void registerMakeSingIn() {
	singIn();
    }
    
    @Before (value = "@actionCheckers")
    public void actionsMakeSingIn() {
	singIn();
    }

    @After
    public void tearDown() {
	Utils.driver.quit();
    }
    
    
    private void singIn() {
	LoginSteps loginSteps = new LoginSteps();

	loginSteps.makeSingIn("Admin", "admin123", "Welcome");

    }

}
