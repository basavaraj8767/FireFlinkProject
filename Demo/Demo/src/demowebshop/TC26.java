package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC26 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//a[.='Health Book'])[2]")).click();
		driver.findElement(By.id("add-to-cart-button-22")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//a[@class='product-name' and .='Health Book']/../../td[5]/input")).clear();
		driver.findElement(By.xpath("//a[@class='product-name' and .='Health Book']/../../td[5]/input")).sendKeys("10");
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}
}
