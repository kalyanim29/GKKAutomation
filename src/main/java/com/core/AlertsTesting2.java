package com.core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTesting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert at = driver.switchTo().alert();
        at.accept();
       // driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
      //  Alert at2 = driver.switchTo().alert();
       //  at2.dismiss();
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Alert at3 = driver.switchTo().alert();
        at3.dismiss();
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
       Alert at1 = driver.switchTo().alert();
        at1.sendKeys("krishna");
        at1.accept();
        
	}

}
