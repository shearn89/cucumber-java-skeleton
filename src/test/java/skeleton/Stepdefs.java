package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
    Belly belly;
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int hours) throws Throwable {
        belly.wait(hours);
    }
    
    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        assert belly.isGrowling() == true;
    }
}
