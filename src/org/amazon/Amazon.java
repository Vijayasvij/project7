package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium2daytask1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement txtname = driver.findElement(By.xpath("//input[@type='text']"));
	txtname.sendKeys("iphone");
	WebElement btnclick = driver.findElement(By.xpath("//input[@id=\'nav-search-submit-button']"));
	btnclick.click();
	
	}

}
