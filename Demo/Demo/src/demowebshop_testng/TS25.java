package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TS25 extends Generic{
	@Test
	public void rem_wish() {
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//h2[@class='product-title']/a[.='Health Book']")).click();
		driver.findElement(By.id("add-to-wishlist-button-22")).click();
		driver.findElement(By.xpath("//a[.='Wishlist']")).click();
		driver.findElement(By.xpath("//td[@class='product']/a[.='Health Book']/../../td[1]/input")).click();
		driver.findElement(By.name("updatecart")).click();
		
	}
}
