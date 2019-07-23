package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSecond extends BaseAccess {

	public void navigateCity() {
		WebElement testDropdown = driver.findElement(By.name("country"));
		Select country = new Select(testDropdown);
		country.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		country.selectByValue("ANGOLA");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		testDropdown.click();
		country.selectByVisibleText("AUSTRIA");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	}
}
