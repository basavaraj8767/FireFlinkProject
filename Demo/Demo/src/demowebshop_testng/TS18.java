package demowebshop_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TS18 extends Generic {
	@Test
	public void rec_view() {
		driver.findElement(By.xpath("//a[.='Recently viewed products']")).click();
		
	}
}
