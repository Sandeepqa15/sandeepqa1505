package basics;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlllink { 
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the url");
    String url=sc.nextLine();
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    List<WebElement> alllink = driver.findElements(By.xpath("//a"));
    int count = alllink.size();
    System.out.println(count);
    for (WebElement text : alllink) {
		System.out.println(text.getText());
	}
    driver.close();
	}

}
