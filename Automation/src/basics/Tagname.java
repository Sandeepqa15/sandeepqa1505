package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		Object hrefvalue = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
         System.out.println("tag name ="+tag);
         System.out.println(hrefvalue);
         driver.close();
	} 

}
