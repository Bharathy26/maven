package org.packages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	static WebDriver driver;
	@BeforeClass
	public static void browserlaunch() {
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
	
	
@Test
public void login() {
	// TODO Auto-generated method stub
	WebElement bntusername = driver.findElement(By.id("username"));
	bntusername.sendKeys("bharathy1726");
	String name = bntusername.getAttribute("value");
	assert.assertEquals("verify username","bharathy1726",name);
	
	WebElement bntpassword = driver.findElement(By.id("password"));
	bntpassword.sendKeys("bharathy1726@");
	String pass = bntusername.getAttribute("value");
	assert.assertEquals("verify username","bharathy1726@",name);


	WebElement bntlogin = driver.findElement(By.id("login"));
	bntlogin.click();
	String title = driver.getTitle();
boolean b = title.contains("bntlogin");
assert.assertTrue("verify title", b);
}






@AfterClass
public static void Close() {
driver.quit();
}
}
	

