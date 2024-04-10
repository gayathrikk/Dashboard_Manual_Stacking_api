package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Registration_api {
	
	@Test(priority=1)
	public void Registration()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/ManualRegistration");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Registration failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Registration passed. Status code: " + statusCode1);
	}
		@Test(priority=2)
    public void api_Brain_In()
           {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/ManualRegIn");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard_Manual.Stacking_Manual.Stacking  Brain_In passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard_Manual.Stacking Brain_In. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard_Manual.Stacking API request to the Dashboard_Manual.Stacking Brain_In  failed");
           
           }
	@Test(priority=3)
	public void api_InProgress() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/1");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking INProgress Passed. Status code:"+ statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking INProgress failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking API request to the Dashboard_Manual.Stacking INProgress failed");
	}
	@Test(priority=4)
	public void api_ManualReview() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/2");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard_Manual.Stacking Review passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard_Manual.Stacking Review   failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking Review  failed");
        
    }
		
	@Test(priority=5)
	public void api_AutoReview() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/7");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking AutoReview passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking AutoReview  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking AutoReview failed");
         
     }
	@Test(priority=6)
	public void api_Registration_Review() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/6");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking MRI_Registration Review passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking MRI_Registration Review  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking MRI_Registration Review failed");
         
     }
	@Test(priority=7)
	public void api_Rework() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/4");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking Rework passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking Rework  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking Rework failed");
     }
	@Test(priority=7)
	public void api_reject() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/5");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking reject passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking reject  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking reject failed");
     }
	@Test(priority=8)
	public void api_OUT() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/ManualRegSSQuery/3");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking Out passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard_Manual.Stacking Out  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard_Manual.Stacking Out failed");
     }
}


