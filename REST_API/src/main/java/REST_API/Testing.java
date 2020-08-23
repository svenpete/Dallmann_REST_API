/**
 * Testing
 * <p>
 * Version 1.0
 * <p>
 * 26.05.2020
 */

package REST_API;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Testing {

    /**
     * testing GET-Request for one device
     * if the test failed there will be a specific statusCode
     */

    @Test (priority = 1)
    public void testStatusCodeGetDevice() {
        int inventoryNumber = 105;
        Response response = RestAssured.get("http://localhost:8080/REST_API_war/" +
                "restapi/devices/device/" + inventoryNumber);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        given().then().statusCode(statusCode);
        System.out.println(response.getStatusLine());
        System.out.println("Result out of database:");
        System.out.println();
        System.out.println(response.asString());
    }

    /**
     * testing GET-Request for getting a list of all devices
     * if the test failed there will be a specific statusCode
     */

    @Test (priority = 2)
    public void testStatusCodeGetDevices() {
        Response response = RestAssured.get("http://localhost:8080/REST_API_war/" +
                "restapi/devices");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        given().then().statusCode(statusCode);
        System.out.println(response.getStatusLine());
        System.out.println("Result out of database:");
        System.out.println();
        System.out.println(response.asString());
    }

    /**
     * testing POST-Request for creating new device
     *
     * @throws JsonProcessingException: class for all problems encountered when processing...
     *                                  ...(parsing, generating) JSON content
     */

    @Test (priority = 3)
    public void testStatusCodePostDevice() throws JsonProcessingException {
        RestAssured.baseURI = "http://localhost:8080/REST_API_war/restapi/devices";
        RequestSpecification request = RestAssured.given().contentType("application/json")
                .accept("application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("inventoryNumber", "115");
        jsonObject.put("status", "In Wartung");
        jsonObject.put("designation", "HUSQVARNA K990");
        jsonObject.put("serialNumber", "UC7651E");
        jsonObject.put("guarantee", "11.05.2021");
        jsonObject.put("category", "Motorflex");
        jsonObject.put("note", "Testobjekt");
        jsonObject.put("reservationStatus", String.valueOf(true));

        Response response = RestAssured.get("http://localhost:8080/REST_API_war/" +
                "restapi/devices/device/" + jsonObject.get("inventoryNumber"));

        String responseValidation = response.asString();
        if (responseValidation.contains("{\"inventoryNumber\":0," +
                "\"reservationStatus\":false,\"response\":\"test\"}")) {
            request.body(jsonObject.toJSONString());
            Response response2 = request.post("/device").then().log().body()
                    .extract().response();
            int statusCode = response2.getStatusCode();
            Assert.assertEquals(statusCode, 200);
            System.out.println(response2.getStatusLine());

            Response response3 = RestAssured.get("http://localhost:8080/REST_API_war/" +
                    "restapi/devices/device/" + jsonObject.get("inventoryNumber"));
            System.out.println();
            System.out.println("Folgendes Gerät ist erfolgreich in der" +
                    " Datenbank angelegt worden (GET-Request):");
            System.out.println();
            System.out.println(response3.asString());

        } else {
            System.out.println("Die Ressource mit der ID: \"" + jsonObject.get("inventoryNumber") +
                    "\" existiert bereits.");
        }
    }




    /**
     * testing PUT-Request to update a device in database
     */

    @Test (priority = 4)
    public void testStatusCodePutDevice() {
        RestAssured.baseURI = "http://localhost:8080/REST_API_war/restapi/devices";
        int inventoryNumber = 103;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("inventoryNumber", inventoryNumber);
        jsonObject.put("status", "In Wartung");
        jsonObject.put("designation", "HUSQVARNA K400");
        jsonObject.put("serialNumber", "UC7651E");
        jsonObject.put("guarantee", "11.05.2022");
        jsonObject.put("category", "Kettensäge");
        jsonObject.put("note", "Testobjekt");
        jsonObject.put("reservationStatus", String.valueOf(true));

        Response response = RestAssured.get("http://localhost:8080/REST_API_war/" +
                "restapi/devices/device/" + inventoryNumber);
        System.out.println("Das war das alte Gerät:");
        System.out.println(response.asString());

        RequestSpecification request = RestAssured.given().contentType("application/json")
                .accept("application/json");
        request.body(jsonObject.toJSONString());
        Response response2 = request.put("/device");
        int statusCode = response2.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println(response2.getStatusLine());
        System.out.println("Das ist das neue Gerät:");
        Response response3 = RestAssured.get("http://localhost:8080/REST_API_war/" +
                "restapi/devices/device/" + inventoryNumber);
        System.out.println(response3.asString());
    }

    /**
     * testing DELETE-Request to delete a specific device
     */

    @Test (priority = 5)
    public void testStatusCodeDeleteDevice() {
        RestAssured.baseURI = "http://localhost:8080/REST_API_war/restapi/devices";
        int inventoryNumber = 102;

        given().header("Content-Type", "application/json").contentType(ContentType.JSON).
                accept(ContentType.JSON).when().delete("/device/" + inventoryNumber).
                then().statusCode(200);

        System.out.println("Das löschen des Datensatzes war erfolgreich:");
        System.out.println("http://localhost:8080/REST_API_war/" +
                "restapi/devices/device/" + inventoryNumber);
    }
}