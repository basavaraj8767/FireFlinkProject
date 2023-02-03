package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS12 extends Generic {
	@Test
	public void order_cr() {
		driver.findElement(By.xpath("(//a[contains(.,'Computers')])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']/a")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		//driver.findElement(By.id("billing-address-select")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.id("paymentmethod_2")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.id("CardholderName")).sendKeys("abcd");
		driver.findElement(By.id("CardNumber")).sendKeys("1802199919990281");
		driver.findElement(By.id("CardCode")).sendKeys("2356");
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		
	}
}
