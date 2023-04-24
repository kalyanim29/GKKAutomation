package com.core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box')]]")).click();
	   Alert at=driver.switchTo().alert();
	    at.accept();
	    driver.findElement(By.xpath("  //a[text()[contains(.,'Alert with OK & Cancel ')]] "));
	    at.dismiss();
	    driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel ')]]")).click();
	    driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box')]]")); 
	    at.sendKeys("krishna");
	   at.accept();
	}

}
