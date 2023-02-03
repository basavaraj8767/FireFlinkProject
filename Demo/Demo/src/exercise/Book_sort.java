package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_sort {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		WebElement dd = driver.findElement(By.id("products-orderby"));
		Select s = new Select(dd);
		List<WebElement> text = s.getOptions();
		for (WebElement ddtext : text) {
			System.out.println(ddtext.getText());
		}
		driver.quit();
	}
}
