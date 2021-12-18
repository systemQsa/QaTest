package rest;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import rest.dto.CreatedBoardDto;
import rest.requestSpecifications.RequestSpecifications;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

/*
key = ad7e2fb85d583015a2e883e97a0a6752
token = 72815be243734e14c107ba025aa4c93d1d4948238a974b0dd0a3b36a7967b22c


80db5373ee6b8562f4c2bcc47da83124
0cec3d53776403b90e02cd1b492be32f40384a821c79ef48770e6dbc0be2d2ae

https://trello.com/1/authorize?expiration=never&scope=read,write,account&response_type=token&name=ServerToken&key={80db5373ee6b8562f4c2bcc47da83124}
 */

public class TrelloRestClient {

    private String id;
    private final String BOARD_MANAGEMENT_URL = "https://trello.com/1/boards/";
    private final Header header = new Header("Content-Type", "application/json");
    private final String createBoard = "/1/boards/";
    private String name = "newBoard";

    public void sendCreateBoardRequest() {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("name", "hello");
        queryParams.put("key", "@@@");
        queryParams.put("token", "@@@");
        // Header header = new Header("Content-Type", "application/json");
        //Header header = new Header("Accept","application/json");
        //.accept()
        Response response = given().spec(RequestSpecifications.basicSpec)
                .log().all()
                .post(createBoard)
                .then()
                .statusCode(200)
                .and().extract().response();
//                .contentType(ContentType.JSON)
//                .header(header)
//                .queryParams(queryParams)
//                .post(BOARD_MANAGEMENT_URL)
//                .then().statusCode(200)
//                .and().extract().response();

        CreatedBoardDto createdBoardDto = response.as(CreatedBoardDto.class);
        // id = response.jsonPath().get("id");
        //  id = createdBoardDto.getId();
    }

    public void sendDeleteBoardRequest() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("name", "hello");
        queryParams.put("key", "80db5373ee6b8562f4c2bcc47da83124");
        queryParams.put("token", "0cec3d53776403b90e02cd1b492be32f40384a821c79ef48770e6dbc0be2d2ae");
        Response response = given()
                .contentType(ContentType.JSON)
                .header(header)
                .queryParams(queryParams)
                .delete(BOARD_MANAGEMENT_URL + id)
                .then().statusCode(200).extract().response();

    }

    public void sendGetBoardRequest(int statusCode) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("key", "80db5373ee6b8562f4c2bcc47da83124");
        queryParams.put("token", "0cec3d53776403b90e02cd1b492be32f40384a821c79ef48770e6dbc0be2d2ae");
        queryParams.put("name", "hello");
        given()
                .header(header)
                .queryParams(queryParams)
                .get(BOARD_MANAGEMENT_URL + id)
                .then().statusCode(statusCode);
    }
}

