package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggIphone {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.name("q")).sendKeys("iphone");
     List<WebElement> sugg = driver.findElements(By.xpath("//ul/li"));
     int count=sugg.size();
     System.out.println(count);
     for (int i = 0; i <=count; i++) {
		System.out.println(sugg.get(i).getText());
	}
     driver.close();
	}

}
