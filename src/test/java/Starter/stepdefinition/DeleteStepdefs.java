package Starter.stepdefinition;

import Starter.Project.Delete;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeleteStepdefs {
    @Steps
    Delete delete;
    @Given("I set url delete product")
    public void iSetUrlDeleteProduct() {
        delete.setUrlDeleteProduct();

    }

    @When("I request delete product")
    public void iRequestDeleteProduct() {
        delete.requestDeleteProduct();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        delete.getStatusCode200();
    }
}
