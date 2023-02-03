package ty1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SuperITCom/Downloads/iframe.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//img[contains(@alt,'Facebook')])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[.='Google']")).click();
		driver.quit();
	}
}
