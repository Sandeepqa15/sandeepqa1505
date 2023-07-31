package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.in/");
      List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
      for (int i = 0; i < alllinks.size(); i++) {
		String text = alllinks.get(i).getText();
		System.out.println(text);
		
	}
	driver.close();
	}

}
