package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			boolean status = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			if (status==true) {
				System.out.println("checkbox is selected");
			}
			else {
				System.out.println("checkbox is not selected");
			}
			driver.close();
	}

}
