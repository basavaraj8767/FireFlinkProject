package demowebshop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS06 extends Generic {
	@Test
	public void book2() {
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		WebElement dd = driver.findElement(By.id("products-orderby"));
		Select s=new Select(dd);
		s.selectByIndex(4);
	}
}
