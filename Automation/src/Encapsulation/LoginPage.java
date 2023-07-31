package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgnbtn;
	public LoginPage( WebDriver driver) {
	  untbx=driver.findElement(By.id("username"));
	  pwtbx=driver.findElement(By.name("pwd"));
	  lgnbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setLogin(String un,String pwd) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgnbtn.click();
	}
		
	}


