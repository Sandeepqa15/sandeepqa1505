package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {
	 static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.cleartrip.com/");
     
	}

}
