package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC15 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("(//a[.='Addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("xyz");
		driver.findElement(By.id("Address_LastName")).sendKeys("abc");
		driver.findElement(By.id("Address_Email")).sendKeys("basavarajpatil@gmail.com");
		WebElement dd = driver.findElement(By.id("Address_CountryId"));
		Select s=new Select(dd);
		s.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("Address_Address1")).sendKeys("#12");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("560000");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}




}
