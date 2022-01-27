package org.greenstech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhivya csc\\eclipse-workspace\\Locators\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/bus-tickets");
		driver.findElement(By.id("txtSource")).sendKeys("madurai");
		driver.findElement(By.id("txtDestination")).sendKeys("chennai");
		
	}

}
