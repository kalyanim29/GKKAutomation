package com.core;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingConcept {
	
	public static String parent,linkedIn,facebook,youtube;
	public static Set<String > all;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			facebook=it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rama");
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		all = driver.getWindowHandles();
		it= all.iterator();
		while(it.hasNext())
		{
			linkedIn=it.next();
			if(!parent.equals(linkedIn))
			{
				driver.switchTo().window(linkedIn);
			}
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
	}

}


