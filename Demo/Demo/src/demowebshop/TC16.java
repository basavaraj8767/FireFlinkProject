package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("(//a[.='Addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}
}
