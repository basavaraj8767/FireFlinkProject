package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_sort {
	@FindBy (id="products-orderby")
	private WebElement sort_dd;
	
	public Pom_sort(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement sort() {
		return sort_dd;
	}
}
