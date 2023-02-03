package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS15 extends Generic {
	@Test
	public void add_addr() {
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

	}
}
