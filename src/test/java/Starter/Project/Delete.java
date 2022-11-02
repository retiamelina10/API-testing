package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class Delete {
    private String url;
    private Long id;
    public Long setUrlDeleteProduct() {
        url = "https://alta-shop.herokuapp.com/api/products";
        given().when().get(url);
        id = lastResponse().body().path("[9].id");
        return id;
    }

    public void requestDeleteProduct() {
        given().when().get(url + "/" + id);
    }
}
