package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDriver {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     LoginPage l=new LoginPage(driver);
     l.setLogin("admin", "manager");
	}

}
