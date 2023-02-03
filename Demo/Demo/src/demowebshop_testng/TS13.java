package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS13 extends Generic {
	@Test
	public void email_change() {
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.name("save-info-button")).click();
	}
}
