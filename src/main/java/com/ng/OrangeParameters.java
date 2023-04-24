package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class OrangeParameters {
	@Test
	@org.testng.annotations.Parameters({"user","pass"})
	public void Orange(String id1,String id2) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(id1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(id2);

}
}
