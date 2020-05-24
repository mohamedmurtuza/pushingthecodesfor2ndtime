package level_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {

	@Test
	public void window() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#openwindow")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> id = window.iterator();
		String parent = id.next();
		String child = id.next();

		driver.switchTo().window(child);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.close();

	}

}
