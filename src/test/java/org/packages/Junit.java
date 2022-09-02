package org.packages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	 static WebDriver driver;
	@org.junit.BeforeClass
	public static void BeforeClass() {
      WebDriverManager.edgedriver().setup();
      driver=new EdgeDriver();
      driver.get("https://adactinhotelapp.com/");
      driver.manage().window().maximize();
	}
	@Before
	public  void Beforemethod() {
		long millis = System.currentTimeMillis(); 
		System.out.println(millis);
	
	}
	@org.junit.AfterClass
	public static void AfterClass() {
	   driver.quit();
		}
	@After
	public void Aftermethod() {
		long millis = System.currentTimeMillis(); 
		System.out.println(millis);
	}
	@Test
	public  void login() {
		 WebElement bntusername = driver.findElement(By.id("username"));
		 bntusername.sendKeys("bharathy1726");
		 
		 WebElement bntpassword = driver.findElement(By.id("password"));
		 bntpassword.sendKeys("bharathy1726@");
		 
		 WebElement bntlogin= driver.findElement(By.id("login"));
         bntlogin.click();
			}
}