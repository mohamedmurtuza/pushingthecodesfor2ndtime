import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#displayed-text")).sendKeys("Murtuza");
		driver.findElement(By.cssSelector("hide-textbox")).click();
		boolean yes = driver.findElement(By.cssSelector("#displayed-text")).isDisplayed();
		System.out.println(yes);

		driver.findElement(By.id("opentab")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ids = windows.iterator();
		String parent = ids.next();
		String child = ids.next();

		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

		driver.close();

	}

}
