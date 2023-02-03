package ty1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("start-maximized");
		opt.addArguments("--headless");
		opt.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.easemytrip.com/6");
		System.out.println("hi");
		driver.quit();
	}
}
