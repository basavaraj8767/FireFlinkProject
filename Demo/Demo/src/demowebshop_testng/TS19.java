package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS19 extends Generic {
	@Test
	public void search() {
		driver.findElement(By.id("small-searchterms")).sendKeys("jeans");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		
	}
}
