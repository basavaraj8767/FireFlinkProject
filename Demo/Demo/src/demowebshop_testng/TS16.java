package demowebshop_testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS16 extends Generic {
	@Test
	public void addr_del() {
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("(//a[.='Addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
}
