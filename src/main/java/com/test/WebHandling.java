package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://chercher.tech/practice/table");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     WebElement webtable=driver.findElement(By.xpath("//table[@id='webtable']/tbody"));
	     List<WebElement> rows=webtable.findElements(By.tagName("tr"));
	     for(int i=1;i<rows.size();i++)
	     {

	       List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));

	     for(int j=0;j<columns.size();j++)
	     {
	       String value=columns.get(j).getText();
	       if(value.equals("Google"))
	        {
	          System.out.println(columns.get(2).getText()); 
	        }
	       {
	    	   String value1=columns.get(j).getText();
	    	   if(value1.equals("Facebook"))
	    	   {
	    		   System.out.println(columns.get(2).getText());
	    	   }
	    	   {
	    		   String value2=columns.get(j).getText();
	    		   if(value2.equals("chercher"))
	    		   {
	    			   System.out.println(columns.get(2).getText());
	    		   }
	    		   {
	    			   String value3=columns.get(j).getText();
	    			   if(value3.equals("Selenium Webdriver"))
	    			   {
	    				   System.out.println(columns.get(2).getText());
	    			   }
	    		   }
	    	   }
	       }
	     }
	}
	}
}








 