package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.findElement(By.name("q")).sendKeys("java");
      Thread.sleep(2000);
      List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
      int count=sugg.size();
      System.out.println(count);
      for (WebElement text : sugg) {
		System.out.println(text.getText());
	}
      sugg.get(count-1).click();
      Thread.sleep(2000);
      driver.close();
	}

}
