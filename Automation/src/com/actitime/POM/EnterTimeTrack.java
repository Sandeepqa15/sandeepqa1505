package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {

	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskbtn;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logotbtn;
	
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setTask() {
		taskbtn.click();
	}
	public void setlogout() {
		logotbtn.click();
	}
	
}
