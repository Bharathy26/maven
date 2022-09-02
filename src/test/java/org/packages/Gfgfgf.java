package org.packages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gfgfgf {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Before
	public void afterTime() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}

	@Test
	public void login() {

		WebElement bntusername = driver.findElement(By.id("username"));
		bntusername.sendKeys("bharathy1726");

		WebElement bntpassword = driver.findElement(By.id("password"));
		bntpassword.sendKeys("bharathy1726@");

		WebElement bntlogin = driver.findElement(By.id("login"));
		bntlogin.click();
	}

	@After
	public void beforetime() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}

	@AfterClass
	public static void closeWindow() {
		driver.quit();
	}

}
