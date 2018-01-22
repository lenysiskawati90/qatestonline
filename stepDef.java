package cucumberTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.GojekPage;

public class StepDefs {
    StepDef step = new StepDef();

    @Given("^I open website gojek$")
    public void I_open_website_gojek() throw Throwable {
        step.successfullyOpenWebsiteGojek();
    }
    
    @And("^I click layanan button$")
    public void I_click_layanan_button() throw Throwable {
        step.successfullyOpenWebsiteGojek();
    }
    
    @When("^I click images <product_option>$")
    public void When_I_click_images_<product_option>() throw Throwable {
        step.successfullyOpenWebsiteGojek();
    }
    
    @Then("^I should see 'Kenapa <product_option>'$")
    public void I_should_see_'Kenapa <product_option>'() throw Throwable {
        step.successfullyOpenWebsiteGojek();
    }
}
