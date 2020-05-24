package level_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class HTTPCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * ChromeOptions option = new ChromeOptions();
		 * option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 * option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "\\Drivers\\chromdriver.exe"); WebDriver driver = new ChromeDriver(option);
		 * driver.get("https://www.spicejet.com/"); driver.manage().window().maximize();
		 * 
		 * Thread.sleep(2000); driver.manage().timeouts().implicitlyWait(5,
		 * TimeUnit.SECONDS);
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 10); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,100)");
		 * 
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src, new File(
		 * "C:\\Users\\91782\\eclipse-workspace\\InterviewPreparation\\ScreenShot\\http.png"
		 * ));
		 */
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Apple");
		a.add("Zeebra");
		a.add("Van");

		System.out.println(a);
		Collections.sort(a);

		System.out.println(a);
		Collections.reverse(a);

		System.out.println(a);

	}

}
