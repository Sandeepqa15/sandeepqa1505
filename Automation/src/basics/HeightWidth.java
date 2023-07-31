package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.actitime.com/login.do");
   WebElement un = driver.findElement(By.id("username"));
   int unheight = un.getSize().getHeight();
   int unwidth=un.getSize().getWidth();
   WebElement pwd = driver.findElement(By.name("pwd"));
   int pwdheight = pwd.getSize().getHeight();
   int pwdwidth=pwd.getSize().getWidth();
   if (unheight==pwdheight && unwidth==pwdwidth) {
	System.out.println("un and pwd text box is equal and pass");
}
   else {
	System.out.println("fail");
}
	}

}
