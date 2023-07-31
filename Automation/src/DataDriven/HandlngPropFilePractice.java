package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlngPropFilePractice {

	public static void main(String[] args) throws IOException {
     WebDriver driver=new ChromeDriver();
    FileInputStream fis=new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String Url = p.getProperty("Url");
    String Un = p.getProperty("Username");
    String pwd = p.getProperty("Password");
    driver.get(Url);
    driver.findElement(By.id("username")).sendKeys(Un);
    driver.findElement(By.name("pwd")).sendKeys(pwd);
    
	}

}
