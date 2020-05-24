package pageObject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	public void loginPage() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		// DesiredCapabilities option = DesiredCapabilities.chrome();
		ChromeOptions option = new ChromeOptions();
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com");

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.emailId().sendKeys("mohamedm@gmail.com");
		Thread.sleep(1000);
		lpo.submitButton().click();
		lpo.seleniumDropDown().click();
		lpo.fileUpload().click();
		Thread.sleep(2000);
		lpo.robot();
		Thread.sleep(1000);
		lpo.selection();
		Thread.sleep(1000);
		lpo.checkBox().click();
		Thread.sleep(1000);
		lpo.fileSubmit().click();
		Thread.sleep(1000);
		lpo.screenShot();
		driver.quit();

	}

}
