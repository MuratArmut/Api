package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

    /*
        YAPILACAKLAR

        1) Request body ve end-point hazırlama
        2) Expected data hazırlama
        3) Request gönderip dönen response kaydetme
        4) Assertion

        given() : Teste başlarken bize verilen başlangıç değerlerini ifade eder.
        when()  : Testte gerçekleştireceğimiz işlemleri ifade eder.
        then()  : Response değerlerini değerlendirmek için yapılan işlemleri ifade eder.
        and()   : Birbirine bağlı işlemleri ifade eder.

     */

    /*
     https://restful-booker.herokuapp.com/booking/83

    url'ine bir GET request gonderdigimizde

    donen Response'un,
                status code'unun 200,
                content type'inin application/json; charset=utf-8,
                Server isimli Header'in degerinin Cowboy,
                status Line'in HTTP/1.1 200 OK
                response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
    */

    @Test
    public void get01(){

        // 1-url belirleyip url adresine gideceğiz (Endpoint Hazırlama)
        String url="https://restful-booker.herokuapp.com/booking/46";


        // 2-Açıkça verilmişse expected data belirlenir.(burda verilmemiş)


        // 3-Actual Data alınır.
        Response response=given().when().get(url);

        //response.prettyPrint();   response objesinin yazdırılma şeklidir.

        //System.out.println("Status Code: "+response.getStatusCode()); // 200
       System.out.println("Status Code: "+response.statusCode()); // 200 buşekildede olur.

        System.out.println("Content Type: "+response.getContentType()); // application/json; charset=utf-8

        System.out.println("Server Header Değeri: "+response.getHeader("Server"));

        System.out.println("Status Line: "+response.getStatusLine()); // HTTP 1.1/ 200 OK

        System.out.println("Get Time: "+response.getTime()); // least than 5

        System.out.println("---------------------------------------------------------------------");
        //System.out.println("Server Header Değeri: "+response.getHeaders());







    }
}
