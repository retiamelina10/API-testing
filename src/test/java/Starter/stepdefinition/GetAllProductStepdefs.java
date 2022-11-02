package Starter.stepdefinition;

import Starter.Project.GetAllProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetAllProductStepdefs {
    @Steps
    GetAllProduct getAllProduct;

    @Given("I set url get all product and valid token")
    public void iSetUrlGetAllProductAndValidToken() {
        getAllProduct.setUrlGetAllProductAndValidToken();
    }

    @When("I request get all product")
    public void iRequestGetAllProduct() {
        getAllProduct.requestGetAllProduct();
    }

    @Given("I set url get all product and invalid token")
    public void iSetUrlGetAllProductAndInvalidToken() {
        getAllProduct.setUrlGetProductAndInvalidToken();

    }
}
