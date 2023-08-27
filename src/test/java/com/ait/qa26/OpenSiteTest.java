package com.ait.qa26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {
  WebDriver driver;

  @BeforeMethod

  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");


  }
  @Test
  public void openSiteTest(){
    System.out.println("Site opened!!!");
  }

  @AfterMethod
  public void tearDown(){
    //driver.quit();
  }

}
