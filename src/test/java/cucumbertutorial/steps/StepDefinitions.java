package cucumbertutorial.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumbertutorial.screens.LaunchScreen;

public class StepDefinitions {
    @Given("^I opt to register as DBS Customer$")
    public void i_opt_to_register_as_DBS_Customer() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        LaunchScreen launchScreen = new LaunchScreen();
        launchScreen.registerAsDBSCustomer();
        Thread.sleep(10000);
    }

    @When("^I enter my digibank details$")
    public void i_enter_my_digibank_details() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should land in home screen$")
    public void i_should_land_in_home_screen() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
