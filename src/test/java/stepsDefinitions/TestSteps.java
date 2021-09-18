package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import utils.Utils;

public class TestSteps {
	
	@Dado("Acessing the System")
	public void acessing_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	    Utils.accesSystem();
	}

}
