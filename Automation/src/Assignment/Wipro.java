package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("wiprojobs"+Keys.ENTER);
Thread.sleep(3000);
List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
for (WebElement link : alllinks) {
	String url = link.getAttribute("href");
	System.out.println(url);
}
driver.close();
	}

}
