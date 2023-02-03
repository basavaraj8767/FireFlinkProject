package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS21 extends Generic{
	@Test
	public void cell_view() {
		driver.findElement(By.xpath("(//a[contains(.,'Electronics')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Cell')])[3]")).click();
		WebElement dd = driver.findElement(By.id("products-viewmode"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		
	}
}
