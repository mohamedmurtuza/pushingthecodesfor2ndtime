package level_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {
	static String month = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		month = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		System.out.println(month);
		// Thread.sleep(1000);

		while (!month.equalsIgnoreCase("August 2020")) {

			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			Thread.sleep(1000);
			month = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();

		}

		System.out.println("Month Selected");

		List<WebElement> calendar = driver
				.findElements(By.xpath("(//tbody[@class='rd-days-body'])[1] //div[@class='day has-info']"));

		String dates = driver.findElement(By.xpath("//div[@class='day has-info']")).getText();

		int count = calendar.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {

			System.out.println((driver.findElement(By.xpath("//div[@class='day has-info']")).getText()));

		}

		driver.quit();

		/*
		 * while(!date.equalsIgnoreCase("15")) {
		 * 
		 * 
		 * }
		 */

	}

}
