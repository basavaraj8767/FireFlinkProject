package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_all_links {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 System.out.println(links.size());
		 for (WebElement linktext : links) {
			System.out.println(linktext.getText());
		
		}
		 driver.quit();
	}
}
