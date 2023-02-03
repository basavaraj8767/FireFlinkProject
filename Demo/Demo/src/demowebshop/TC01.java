package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("basavaraj");
		driver.findElement(By.id("LastName")).sendKeys("Patil");
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj@1234");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}
}
