package Starter.Project;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Register {
    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();
    public void setUrlRegiseter() {
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }

    public void validBodyData() {
<<<<<<< HEAD
        body.put("email", "retiamelina28@gmail.com");
=======
        List<String> category = new LinkedList<>();
        body.put("email", "retiamelina99@gmail.com");
>>>>>>> 781f4ba4c09c84d7fc9f579cf5ac1e5cf0031b7a
        body.put("password","Retiaah10");
        body.put("full name", "Retia MElina");
        data.add(body);
    }

    public void requestToregisterWithValidData() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .body(data)
                .when().post(url);
    }

    public void getStatusCode200() {
        then().statusCode(200);
    }

    public void requestToRegisterWithInvalidBody() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void getStatusCode400() {
        then().statusCode(400);
    }

    public void setEmailAndPassword() {
        body.put("email","retiamelina10@gmail.com");
    }

    public void requestToRegister() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void setPasswordAndFullname() {
        body.put("password","Retiaah10");
        body.put("full name", "Retia MElina");
    }

    public void setEmailAndFullname() {
        body.put("email", "retiamelina10@gmail.com");
        body.put("full name", "Retia MElina");
    }

    public void setEmail() {
        body.put("email", "retiamelina10@gmail.com");
    }

    public void setPassword() {
        body.put("password","Retiaah10");
    }

    public void setFullname() {
        body.put("full name", "Retia MElina");
    }
}
