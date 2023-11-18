package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C04_PUT_ResponseAssert {

    /*
    https://jsonplaceholder.typicode.com/posts/17

    url’ine asagidaki Json formatindaki body ile bir
    PUT request gonderdigimizde
                {
                "title": "Murat",
                "body": "Hello My Friend",
                "userId": 17,
                "id": 17
                }
    donen Response’un,
                status code’unun 200,
                content type’inin application/json; charset=utf-8,
                Server isimli Header’in degerinin cloudflare,
                status Line’in HTTP/1.1 200 OK olduğunu assert ediniz.
     */

    @Test
    public void putAssert01(){

        String url = "https://jsonplaceholder.typicode.com/posts/17"; //endPoint

        JSONObject reqBody = new JSONObject();
            reqBody.put("title","Murat");
            reqBody.put("body","Hello My Friend");
            reqBody.put("userId",17);
            reqBody.put("id","17");


        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .when()
                                    .body(reqBody.toString())
                                    .put(url);


        response.then().assertThat()
                                    .statusCode(200)
                                    .contentType("application/json; charset=utf-8")
                                    .header("Server","cloudflare")
                                    .statusLine("HTTP/1.1 200 OK");


    }

}
