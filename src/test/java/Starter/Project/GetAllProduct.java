package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProduct {
    private String url, token;
    public void setUrlGetAllProductAndValidToken() {
        url ="https://alta-shop.herokuapp.com/api/products";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJldGlhIE1lbGluYSIsIkVtYWlsIjoicmV0aWFtZWxpbmExMEBnbWFpbC5jb20ifQ.KH8ilSjFvxM320Hh4R-EEP5fIK_BbD1q71pSk7gYeS8";
    }

    public void requestGetAllProduct() {
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);

    }

    public void setUrlGetProductAndInvalidToken() {
        url ="https://alta-shop.herokuapp.com/api/products";
        token = "ZWxpbmExMEBnbWFpbC5jb20ifQ.KH8ilSjFvxM320Hh4R-EEP5fIK_BbD1q71pSk7gYeS8";

    }
}
