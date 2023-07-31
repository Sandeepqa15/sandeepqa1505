package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhone {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
     List<WebElement> allmob = driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone 14 Pro Max\")]"));
    List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone 14 Pro Max\")]/../../div[2]/div[1]/div[1]/div[1]"));
     for (int i = 0; i <allmob.size(); i++) {
    	 String mob = allmob.get(i).getText();
    	 String price = allprice.get(i).getText();
    	 System.out.println(mob+"--> "+price);
		
	}
     driver.close();
	}

}
