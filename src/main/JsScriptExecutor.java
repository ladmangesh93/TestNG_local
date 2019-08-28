package src.base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JsScriptExecutor {

	WebDriver driver;
	JavascriptExecutor js;
	
	@Test
	public void f() throws InterruptedException{
		js.executeScript("return document.getElementById('name').value='text';");
		WebElement button = (WebElement) js.executeScript("return document.getElementById('alertbtn');");
		button.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.location.assign('https://learn.letskodeit.com/p/practice');");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
