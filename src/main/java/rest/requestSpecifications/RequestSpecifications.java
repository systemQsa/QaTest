package rest.requestSpecifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import properties.PropertyLoader;

public class RequestSpecifications {
    public static RequestSpecification basicSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri(PropertyLoader.getProperty("Root_URL"))
            .addHeader("Content-Type","application/json")
            .addQueryParam("key",PropertyLoader.getProperty("KEY"))
            .addQueryParam("token",PropertyLoader.getProperty("TOKEN"))
            .addQueryParam("name",PropertyLoader.getProperty("NAME"))
            .build();
}
