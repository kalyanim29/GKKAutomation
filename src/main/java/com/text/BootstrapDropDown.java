package com.text;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropDown {

	private static List<WebElement> findElements;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement course = driver.findElement(By.xpath("//button[@id='menu1']"));
	   course.click();
	   List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
	   for(WebElement each:all)
	   {
		  // if(each.getText().equals("JavaScript"))
		   //{
			 //  each.click();
			 //  break;
		 //  }
		   if(each.getText().equals("HTML"))
		   {
			   each.click();
			   break;
		   }
	   }
	}

}
