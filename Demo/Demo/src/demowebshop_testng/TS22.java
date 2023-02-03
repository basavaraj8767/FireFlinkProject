package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS22 extends Generic {
	@Test
	public void book_compare() {
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		driver.findElement(By.xpath("//a[.='Computing and Internet']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		driver.findElement(By.xpath("//a[.='Fiction']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		
	}
}
