package level_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxCount {

	public static void main(String[] args) throws InterruptedException {

		// input[@type='checkbox']

		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromdriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.ixigo.com/flights");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
