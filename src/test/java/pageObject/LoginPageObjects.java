package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPageObjects {
	Robot r;
	WebDriver driver;

	LoginPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	private By username = By.name("emailid");
	private By submit = By.name("btnLogin");
	private By dropdown = By.xpath("(//a[@class='dropdown-toggle'])[1]");
	private By upload = By.xpath("//li/ul/li[10]");
	private By choooseFile = By.cssSelector("#uploadfile_0");
	private By checkBox = By.cssSelector("#terms");
	private By submitFile = By.cssSelector("#submitbutton");

	public WebElement emailId() {

		return driver.findElement(username);

	}

	public WebElement submitButton() {

		return driver.findElement(submit);
	}

	public WebElement seleniumDropDown() {

		return driver.findElement(dropdown);
	}

	public WebElement fileUpload() {
		return driver.findElement(upload);
	}

	public WebElement chooseFiles() {

		return driver.findElement(choooseFile);
	}

	public void actions() {

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#uploadfile_0"))).build().perform();
		a.click();
	}

	public void robot() throws AWTException, InterruptedException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_ENTER);

	}

	public void selection() throws InterruptedException {

		StringSelection s = new StringSelection(
				"C:\\Users\\91782\\eclipse-workspace\\InterviewPreparation\\ScreenShot\\Char Sequence.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public WebElement checkBox() {

		return driver.findElement(checkBox);
	}

	public WebElement fileSubmit() {

		return driver.findElement(submitFile);
	}

	public void screenShot() throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File("C:\\Users\\91782\\eclipse-workspace\\InterviewPreparation\\ScreenShot\\fileUpload.png"));
	}
}
