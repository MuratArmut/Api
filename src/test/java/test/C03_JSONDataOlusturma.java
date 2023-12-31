package test;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C03_JSONDataOlusturma {

   /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.

            {
                "title":"Murat",
                "body":"Merhaba",
                "userId":17
            }
     */

       @Test
       public void JSONData(){

           JSONObject jsonData=new JSONObject();

                        jsonData.put("title","Said");
                        jsonData.put("body","Zalimler için yaşasın cehennem");
                        jsonData.put("userId",1);

           System.out.println("İlk Oluşturduğum jsonData = " + jsonData);

           System.out.println("=========================================================");

       }


        /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.

    {
    "firstname":"Jim",
    "additionalneeds":"Breakfast",
          "bookingdates":{
                    "checkin":"2018-01-01",
                    "checkout":"2019-01-01"
                    },
    "totalprice":111,
    "depositpaid":true,
     "lastname":"Brown"
    }
     */

        @Test
        public void innerJson(){

            JSONObject innerJSonData = new JSONObject();
                innerJSonData.put("checkin","2018-01-01");
                innerJSonData.put("checkout","2019-01-01");

            JSONObject jsonData = new JSONObject();
                jsonData.put("firstname","Jim");
                jsonData.put("additionalneeds","Breakfast");
                jsonData.put("bookingdates",innerJSonData);
                jsonData.put("totalprice",111);
                jsonData.put("depositpaid",true);
                jsonData.put("lastname","Brown");

            System.out.println("JSONData = " + jsonData);
            /*
            {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":
                {
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
                },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
            }
             */

        }

}
