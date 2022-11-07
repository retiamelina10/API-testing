package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.*;

public class Delete {
    private String url;
    private Long id;
    public Long setUrlDeleteProduct() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("[821].id");
        return id;
    }

    public void requestDeleteProduct() {
        given().when().get(url + "/" + id);
    }

    public void getStatusCode200() {
        then().statusCode(200);
    }
}
