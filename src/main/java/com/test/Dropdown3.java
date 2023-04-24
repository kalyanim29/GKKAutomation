package com.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.*;

public class Dropdown3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			//System.out.println(driver.getTitle());
			//First name
			WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstName.sendKeys("Apple");
			//Last name
			WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastName.sendKeys("Bee");
			//Address
			WebElement el = driver.findElement(By.xpath("//textarea[@rows='3']"));
			el.sendKeys("123 bella,ca");
			
			//Email
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("asdf@dg");
			//Phone
			WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
			tel.sendKeys("12345");
			//Gender
		    driver.findElement(By.xpath("//input[@type='radio']")).click();
		    //Hobbies
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
			//Skills
			WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
			Select s=new Select(skills);
			s.selectByVisibleText("C");
			
			//Languages
			//TODO
			
			//Select country
			WebElement countryEl = driver.findElement(By.xpath("//select[@id='country']"));
			Select sCountryEl = new Select(countryEl);
			sCountryEl.selectByVisibleText("Japan");
			
			//DOB
			//Year
			WebElement yearbox = driver.findElement(By.xpath("//select[@id='yearbox']"));
			Select s1=new Select(yearbox);
			s1.selectByVisibleText("1999");
			//Month
			WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select s2=new Select(Month);
			s2.selectByVisibleText("May");
			//Day
			WebElement daybox = driver.findElement(By.xpath("//select[@id='daybox']"));
			Select s3=new Select(daybox);
			s3.selectByVisibleText("7");
			
			//Password
			WebElement firstpassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
			firstpassword.sendKeys("mnhg");
			//Confirm password
			WebElement secondpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
			secondpassword.sendKeys("mnhg");
			WebElement msdd = driver.findElement(By.xpath("//*[@id=\"msdd\"]/Following::class"));
			Select s4=new Select(msdd);
			s4.selectByVisibleText("Arabic");
			
			
			//driver.findElement(By.xpath("//div[@class='form-group']/following::textarea")).sendKeys("123,eastbella,ca");
			//WebElement language=driver.findElement(By.xpath("//div@id='msdd']/following::li"));
			//Select s8=new Select(language);
			//s8.selectByVisibleText("bulgarian");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
