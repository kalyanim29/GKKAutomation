package com.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDisplayEnable {
	public static ChromeDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 SelectDisplayEnable sde=new SelectDisplayEnable();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
        System.out.println(radio.isDisplayed());
        System.out.println(radio.isSelected());
        radio.click();
        System.out.println(radio.isSelected());
        System.out.println(radio.isEnabled());
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Apple");
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Bee");
		WebElement countryEl = driver.findElement(By.xpath("//select[@id='country']"));
		Select sCountryEl = new Select(countryEl);
		sCountryEl.selectByVisibleText("Japan");
		WebElement yearbox = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1=new Select(yearbox);
		s1.selectByVisibleText("1999");
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(skills);
		s.selectByVisibleText("C");
		s.selectByVisibleText("Android");
		sde.snap();
	}
	public void snap() throws IOException
	{
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst=new File(".//Images//pic1.png");
		FileUtils.copyFile(src, dst);
	}

}
