package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGpro {

	@Test(groups= {"Smoke"})
	public void Login() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
	}
	@Test(groups= {"Smoke"})
public void logout() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#root > div > div > div > button")).click();
	}
}
