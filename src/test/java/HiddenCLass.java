import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HiddenCLass {

	static String text;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromdriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("BENG");

		Thread.sleep(2000);

		text = (String) js.executeScript(script);

		// System.out.println(text);

		String city = "BENGALURU INTERNATION AIRPORT";
		while (!city.equalsIgnoreCase(text)) {
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			text = (String) js.executeScript(script);
			Thread.sleep(1000);

			try {
				driver.switchTo().alert().dismiss();
				// System.out.println("Alert is present");

			} catch (NoAlertPresentException e) {

			}

			// System.out.println("City Selected");

		}
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ENTER);

		Assert.assertEquals(text, city);
		driver.quit();
		System.out.println(text);

	}

}
