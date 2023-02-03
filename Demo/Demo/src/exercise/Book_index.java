package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_index {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		Pom_sort p=new Pom_sort(driver);
		Select s = new Select(p.sort());
		List<WebElement> text = s.getOptions();
		for (int i = 0; i <=text.size()-1; i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		driver.quit();
	}
}
