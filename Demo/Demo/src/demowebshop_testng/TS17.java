package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS17 extends Generic {
	@Test
	public void ch_pass() {
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("//a[.='Change password']")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("Raj@1234");
		driver.findElement(By.id("NewPassword")).sendKeys("Raj@1234");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Change password']")).click();
		
	}
}
