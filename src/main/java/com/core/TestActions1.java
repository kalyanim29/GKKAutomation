package com.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestActions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys("Admin");
		a.sendKeys(username,"Admin").build().perform();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys("admin123");
		a.sendKeys(password, "admin123").build().perform();
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		//button.click();
		a.click(button).build().perform();


	}

}
