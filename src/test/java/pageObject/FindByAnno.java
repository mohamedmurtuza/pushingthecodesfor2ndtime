package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindByAnno {

	WebDriver driver;

	FindByAnno(WebDriver driver) {
		this.driver = driver;

	}

	By username = By.xpath("");

	public WebElement User() {
		return driver.findElement(username);
	}

}
