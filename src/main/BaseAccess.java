package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseAccess {
	public static WebDriver driver;

	@BeforeClass
	public void f() {
		System.out.println("In Base Class");
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void exit()
//	{
//		driver.close();
//	}
}
