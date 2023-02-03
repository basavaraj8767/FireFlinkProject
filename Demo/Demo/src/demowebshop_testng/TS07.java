package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TS07 extends Generic{
	@Test
	public void book_cart() {
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//h2[@class='product-title']/a[.='Health Book']")).click();
		driver.findElement(By.id("add-to-cart-button-22")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	}
}
