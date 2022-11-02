package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetProductByID {
    private String url;
    private Long id;
    private String retia;

    public Long setUrlGetProductAndVAlidID() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("[9].id");
        return id;
    }

    public void requestGetProduct() {
        given().when().get(url + "/" + id);
    }

    public Long setUrlGetProductAndInvalidId() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("[0].id");
        return id;
    }

    public void requestGetProductWithInvalidId() {
        given().when().get(url + "/" + id);
    }

    public void getStatusCode404() {
        then().statusCode(404);
    }

    public Long setUrlGetProductAndStringId() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("retia.id");
        return id;
    }

    public void requestGetProductWithStringId() {
        given().when().get(url + "/" + id);
    }

    public Long setUrlGetProductAndCharIs() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("r.id");
        return id;
    }

    public Long setUrlGetProductAndBooleanId() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("true.id");
        return id;
    }

    public void requestGetProductWithBooleanId() {
        given().when().get(url + "/" + id);
    }
}
