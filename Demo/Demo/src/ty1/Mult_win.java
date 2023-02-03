package ty1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mult_win {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SuperITCom/Downloads/MultipleWindow.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Set<String> whs = driver.getWindowHandles();
		for (String wh : whs) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
			
		}
	}
}
