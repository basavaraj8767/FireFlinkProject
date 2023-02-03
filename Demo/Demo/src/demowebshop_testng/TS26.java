package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TS26 extends Generic {
	@Test
	public void qty_ch() {
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//h2[@class='product-title']/a[.='Health Book']")).click();
		driver.findElement(By.id("add-to-cart-button-22")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//a[@class='product-name' and .='Health Book']/../../td[5]/input")).clear();
		driver.findElement(By.xpath("//a[@class='product-name' and .='Health Book']/../../td[5]/input")).sendKeys("10");
	}
}
