package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import utils.Utils;

public class TestSteps {

	@Dado("Acessando o sistema")
	public void acessando_o_sistema() {
		// Write code here that turns the phrase above into concrete actions
		Utils.accesSystem();
	}

}
