package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMtr {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/menu.html");
		WebElement alllist = driver.findElement(By.id("mtr"));
		Select s=new Select(alllist);
		List<WebElement> allmtr = s.getOptions();
		for (int j = 0; j < allmtr.size(); j++) {
     String text = allmtr.get(j).getText();
     System.out.println(text);
		}
		
		driver.close();
	}

}
