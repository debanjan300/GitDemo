package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {

    @Given("^User is on NetBAnking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Navigated to login page");
	//changes happened
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("Login success");
    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
       System.out.println(arg1);
       System.out.println(arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
     System.out.println("Navigated to Home page");
    }

    @And("^Cards are diplayed$")
    public void cards_are_diplayed() throws Throwable {
        System.out.println("Cards are displayed");
    }
    
    @Then("^Cards are diplayed \"([^\"]*)\"$")
    public void cards_are_diplayed(String arg1) throws Throwable {
    	System.out.println(arg1);
    }

}