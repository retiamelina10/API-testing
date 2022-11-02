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

    @And("valid body data")
    public void validBodyData() {
        register.validBodyData();
    }

    @When("I request to register with valid data")
    public void iRequestToRegisterWithValidData() {
        register.requestToregisterWithValidData();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        register.getStatusCode200();
    }

    @And("I set email, password, and full name")
    public void iSetEmailPasswordFullname(){
        register.setEmailAndPassword();
        register.setEmailAndFullname();
        register.setPasswordAndFullname();
        register.setFullname();
        register.setPassword();
        register.setEmail();
    }

    @When("I request to register with invalid body")
    public void iRequestToRegisterWithInvalidBody() {
        register.requestToRegisterWithInvalidBody();
    }

    @Then("I get status code 400")
    public void iGetStatusCode400() {
        register.getStatusCode400();
    }

    @And("I set {string}, {string}, and {string}")
    public void iSetAnd(String arg0, String arg1, String arg2) {
    }

    @And("I set email and password")
    public void iSetEmailAndPassword() {
        register.setEmailAndPassword();
    }

    @When("I request to register")
    public void iRequestToRegister() {
        register.requestToRegister();
    }

    @And("I set password and full name")
    public void iSetPasswordAndFullName() {
        register.setPasswordAndFullname();
    }

    @And("I set email and full name")
    public void iSetEmailAndFullName() {
        register.setEmailAndFullname();
    }

    @And("I set email")
    public void iSetEmail() {
        register.setEmail();
    }

    @And("I set password")
    public void iSetPassword() {
        register.setPassword();
    }

    @And("I set full name")
    public void iSetFullName() {
        register.setFullname();
    }
}
