package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Com_mouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"))).perform();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/ul/li[1]")).click();
		a.moveToElement(driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a"))).perform();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/ul/li[1]"));
		driver.quit();
	}
}