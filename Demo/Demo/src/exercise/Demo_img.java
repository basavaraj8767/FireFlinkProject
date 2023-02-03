package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_img {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 List<WebElement> img = driver.findElements(By.xpath("//img"));
		 System.out.println(img.size());
		 for (WebElement imgtext : img) {
			System.out.println(imgtext.getText());
		
		}
		 driver.quit();
	}
}
