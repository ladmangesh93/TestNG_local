package main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNGClassSecond extends BaseAccess {
	@Test
	public void test3() throws InterruptedException {
		try {
			driver.findElement(By.cssSelector("input[value*='Automation']")).click();
			driver.findElement(By.cssSelector("input[value*='Automation']")).isSelected();
			WebElement testdropdown = driver.findElement(By.id("testingDropdown"));
			Select dropdownoption = new Select(testdropdown);
			dropdownoption.selectByIndex(2);
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.id("dblClkBtn"));
			action.doubleClick(element).perform();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
			Thread.sleep(1000);
			alert.dismiss();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}
	}
}