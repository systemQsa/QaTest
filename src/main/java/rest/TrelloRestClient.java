package rest;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;


public class TrelloRestClient {
    public void sendCreateBoardRequest(){
        String url = "https://api.trello.com/1/boards/";
        Map<String,String> queryParams = new HashMap<>();
        queryParams.put("key","80db5373ee6b8562f4c2bcc47da83124");
        queryParams.put("token","0cec3d53776403b90e02cd1b492be32f40384a821c79ef48770e6dbc0be2d2ae");
        queryParams.put("name"," B20 Board");
        Header header = new Header("Content-Type","application/json");
        //.accept()
        Response response = given()
                .contentType(ContentType.JSON)
                .header(header)
                .queryParams(queryParams)
                .and().post(url)
                .then().statusCode(200)
                .and().extract().response();

    }
}

