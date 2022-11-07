package Starter.Project;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Register {
    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();
    public void setUrlRegiseter() {
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }
    public void setBodyData(String name, String email, String password) {
        List<Integer> category = new LinkedList<>();
        body.put("full name", name);
        body.put("email", email);
        body.put("password", password);
        category.add(2);
        category.add(5);
        data.add(body);
    }

    public void requestToRegister() {
        given().header("content-type", "application/json")
                .body(body)
                .when().post(url);
    }

    public void successRegister() {
        then().statusCode(200);
    }

    public void getBadRequestResponse() {
        then().statusCode(400);
    }

    public void validateSuccessRegister() {
        then().body(equalTo("body data"));
    }

    public void errorMessageEmail() {
        then().body(equalTo("error email is required"));
    }

    public void errorMessagePassword() {
        then().body(equalTo("error password is required"));
    }

    public void errorMessageName() {
        then().body(equalTo("error name"));
    }
}
