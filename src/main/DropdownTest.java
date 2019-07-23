package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest extends BaseAccess {
  @Test
  public void f() {
	  WebElement testDropdown = driver.findElement(By.name("country"));
	  testDropdown.click();
	  Select dropdownoptions = new Select(testDropdown);
	  dropdownoptions.selectByIndex(2);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  dropdownoptions.selectByValue("ANGOLA");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  dropdownoptions.selectByVisibleText("AUSTRIA");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.close();
  }
}
