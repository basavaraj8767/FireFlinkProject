package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("basavarajpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
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
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		driver.quit();
	}




}
