package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }
	 @Test
	public void verifyTitle() {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     String eTitle="soogle";
     String aTitle = driver.getTitle();
     Assert.assertEquals(eTitle, aTitle);
     driver.close();
	}

}
