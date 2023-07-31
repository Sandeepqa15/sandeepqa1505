package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xaxis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    int Xaxis = driver.findElement(By.id("loginbutton")).getLocation().getX();
    int Yaxis=driver.findElement(By.id("loginbutton")).getLocation().getY();
    driver.close();
    System.out.println("X axix = "+Xaxis);
    System.out.println("Y axis = "+Yaxis);
	}

}
