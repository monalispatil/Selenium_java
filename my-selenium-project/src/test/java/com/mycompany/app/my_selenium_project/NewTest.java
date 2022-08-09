package com.mycompany.app.my_selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f()
  {
	  System.out.println("Welcome to selenium");
  }
  
  @Test
  public void LaunchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Moni\\Selenium_April\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
  }
}
