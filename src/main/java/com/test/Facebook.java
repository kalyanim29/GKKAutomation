package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Facebook {
	public static ChromeDriver driver;
	public static int i=0;
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
	public void begin() {
		report=new ExtentReports(".//Report//OrangeHrm.html",true);
		report.addSystemInfo("Envionment", "staging");
		report.addSystemInfo("Author", "kalyani");
		report.addSystemInfo("userStory", "US3050");
		test = report.startTest("To verify Facebook loginpage working with valid credentials");
	}
	
	@Test

	public void fb() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "Facebook website is open"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user");
		test.log(LogStatus.PASS, "entered email address"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pass");
		test.log(LogStatus.PASS, "entered password"+test.addScreenCapture(snap()));
		
	
	}
	@AfterSuite
	public void end()
	{
		report.endTest(test);
		report.flush();
		}
	public String snap() throws IOException
	{
	Random r=new Random();
	String dummy="";
	if(r.nextInt()!=0)
	{
	i=i+1;
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File(".//Images//pic"+i+".png");
	FileUtils.copyFile(src, dest);
	dummy=dest.getAbsolutePath();
	}
	return dummy;
	}

		

}

