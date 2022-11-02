package Starter.stepdefinition;

import Starter.Project.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefs {
    @Steps
    Login login;
    @Given("I set url login")
    public void iSetUrlLogin() {
        login.setUrlLogin();
    }

    @When("I request to login with valid account")
    public void iRequestToLoginWithValidAccount() {
        login.requestToLoginWithValidAccount();
    }

    @And("I set {string}, and {string}")
    public void iSetAnd(String arg0, String arg1) {
        login.setInvalidBodyAccount();
    }

    @And("I set valid body data account")
    public void iSetValidBodyDataAccount() {
        login.setValidBodyDataAccount();
    }

    @Given("I set url login for invalid account")
    public void iSetUrlLoginForInvalidAccount() {
        login.setUrlLoginForInvalidAccount();
    }

    @When("I request to login with invalid body")
    public void iRequestToLoginWithInvalidBody() {
        login.requestToLoginWitInvalidBody();
    }
}
