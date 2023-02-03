package ty1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement rclick = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rclick).perform();
		driver.findElement(By.xpath("//span[.='Cut']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.quit();

	}
}
