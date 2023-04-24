package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		//textbox.sendKeys("iphone",Keys.ENTER);
		//a.moveToElement(textbox).sendKeys("iphone", Keys.ENTER).build().perform();
		a.sendKeys(textbox,"iphone", Keys.ENTER).build().perform();

	}
}