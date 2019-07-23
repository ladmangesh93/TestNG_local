package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTes extends BaseAccess {
	@Test
	  public void f() {
		  WebElement testDropdown = driver.findElement(By.name("country"));
		  Select dropdownoptions = new Select(testDropdown);
		  dropdownoptions.selectByIndex(2);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  //testDropdown.click();
		  dropdownoptions.selectByValue("ANGOLA");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  //testDropdown.click();
		  dropdownoptions.selectByVisibleText("AUSTRIA");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.close();
	  }

}
