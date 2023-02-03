package ty1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {
	
	@Test(dataProvider = "testdata")
	public void test(String name,String pass) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(name);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
	@DataProvider(name="testdata")
	public Object[][] data(){
		Object[][] arr=new Object[3][2];
		arr[0][0]="Basavaraj";
		arr[0][1]="123456";
		arr[1][0]="Raj";
		arr[1][1]="12345";
		arr[2][0]="vijay";
		arr[2][1]="123";
		return arr;		
	}
}
