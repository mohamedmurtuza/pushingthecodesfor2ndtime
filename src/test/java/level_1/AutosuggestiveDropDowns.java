package level_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutosuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		String city = "Bangalore";

		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromdriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.ixigo.com/flights");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='clear-input ixi-icon-cross'])[1]")).click();
		;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[1]")).sendKeys("Chennai");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//input[@class='c-input
		// u-v-align-middle'])[1]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[1]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[2]")).sendKeys("Del");

		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[2]")).sendKeys(Keys.ENTER);

		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
