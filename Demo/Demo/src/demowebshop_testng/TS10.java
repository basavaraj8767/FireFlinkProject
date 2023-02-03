package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS10 extends Generic {
	@Test
	public void computer_page() {
		driver.findElement(By.xpath("(//a[contains(.,'Computers')])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']")).click();
		WebElement dd = driver.findElement(By.id("products-pagesize"));
		Select s=new Select(dd);
		s.selectByIndex(1);
	}
}
