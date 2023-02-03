package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("//a[.='Change password']")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("Raj@1234");
		driver.findElement(By.id("NewPassword")).sendKeys("Raj@1234");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Change password']")).click();
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}




}
