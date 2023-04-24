package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement SelectCountry = driver.findElement(By.xpath("//li[@id='Select Country']/following::select"));
	    Select s=new Select(SelectCountry);
	    s.selectByVisibleText("Benin");
	    List<WebElement> all = s.getOptions();
	    System.out.println(all.size());
	    for(WebElement each:all)
	    {
	    	System.out.println(each.getText());
	    }
		
	}

}
