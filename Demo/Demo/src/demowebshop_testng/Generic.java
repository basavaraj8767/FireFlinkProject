package demowebshop_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	@BeforeClass
	public void openbroeser() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void openapp() {
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void closeapp() {
		driver.findElement(By.xpath("//a[.='Log out']")).click();
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}
