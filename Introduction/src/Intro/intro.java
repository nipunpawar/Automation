package Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
driver.findElement(By.name("inputPassword")).sendKeys("Rahulshetty");
driver.findElement(By.className("signInBtn")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
	}

}
