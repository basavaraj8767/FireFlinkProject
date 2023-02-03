package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS20 extends Generic{
	@Test
	public void cell() {
		driver.findElement(By.xpath("(//a[contains(.,'Electronics')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Cell')])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	}
}
