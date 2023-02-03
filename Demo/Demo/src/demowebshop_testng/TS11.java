package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS11 extends Generic{
	@Test
	public void order() {
		driver.findElement(By.xpath("(//a[contains(.,'Computers')])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']/a")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("billing-address-select")).click();
		driver.findElement(By.xpath("//option[.='New Address']")).click();
		WebElement dd = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select s=new Select(dd);
		s.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("#12");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560000");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		
	}
}
