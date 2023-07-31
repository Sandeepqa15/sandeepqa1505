package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
     WebDriver driver=new ChromeDriver();
     FileInputStream fis=new FileInputStream("./data/commondata.property");
     Properties p=new Properties();
     p.load(fis);
     String url = p.getProperty("Url");
     String un = p.getProperty("Username");
     String pw = p.getProperty("Password");
     driver.get(url);
      driver.findElement(By.id("username")).sendKeys(un);
      driver.findElement(By.name("pwd")).sendKeys(pw);
      driver.findElement(By.xpath("//a/div")).click();
      
	}

}
