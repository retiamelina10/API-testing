package Starter.stepdefinition;

import Starter.Project.GetProductByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetProductByIDStepdefs {
    @Steps
    GetProductByID getProductById;

    @Given("I set url get product and valid id")
    public void iSetUrlGetProductAndValidId() {
        getProductById.setUrlGetProductAndVAlidID();
    }

    @When("I request get product")
    public void iRequestGetProduct() {
        getProductById.requestGetProduct();
    }

    @Given("I set url get product and invalid id")
    public void iSetUrlGetProductAndInvalidId() {
        getProductById.setUrlGetProductAndInvalidId();
    }

    @When("I request get product with invalid id")
    public void iRequestGetProductWithInvalidId() {
        getProductById.requestGetProductWithInvalidId();
    }

    @Then("I get status code 404")
    public void iGetStatusCode404() {
        getProductById.getStatusCode404();
    }

    @Given("I set url get product and string id")
    public void iSetUrlGetProductAndStringId() {
        getProductById.setUrlGetProductAndStringId();
    }

    @When("I request get product with string id")
    public void iRequestGetProductWithStringId() {
        getProductById.requestGetProductWithStringId();
    }

    @Given("I set url get product and char is")
    public void iSetUrlGetProductAndCharIs() {
        getProductById.setUrlGetProductAndCharIs();
    }

    @When("i request get product with char id")
    public void iRequestGetProductWithCharId() {
    }

    @Given("I set url get product and boolean id")
    public void iSetUrlGetProductAndBooleanId() {
        getProductById.setUrlGetProductAndBooleanId();
    }

    @When("I request get product with boolean id")
    public void iRequestGetProductWithBooleanId() {
        getProductById.requestGetProductWithBooleanId();
    }
}

