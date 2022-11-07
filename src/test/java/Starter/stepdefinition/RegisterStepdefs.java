package Starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Starter.Project.Register;

public class RegisterStepdefs {
    @Steps
    Register register;

    @Given("I set url register")
    public void iSetUrlRegister() {
        register.setUrlRegiseter();
    }

    @When("I request to register")
    public void iRequestToRegister() {
        register.requestToRegister();
    }

    @Then("I can validate the response {string}")
    public void iCanValidateTheResponse(String response) {
        if (response.equals("body data")) {
            register.validateSuccessRegister();
        } else if (response.equals("error email is required")){
            register.errorMessageEmail();
        } else if (response.equals("error password is required")) {
            register.errorMessagePassword();
        } else if (response.equals("error name required")) {
            register.errorMessageName();
        }
    }

    @And("I set body data name {string} email {string} and password {string}")
    public void iSetBodyDataNameEmailAndPassword(String arg0, String arg1, String arg2) {
        register.setBodyData(arg0, arg1, arg2);
    }

    @Then("I get status code <code>")
    public void iGetStatusCodeCode(Integer code) {
        if (code.equals(200)) {
            register.successRegister();
        } else if (code.equals(400)){
            register.getBadRequestResponse();
        }
    }
}
