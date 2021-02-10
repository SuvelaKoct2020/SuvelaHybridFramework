package htmlPages;

import org.openqa.selenium.By;


import base.PredefinedActions;

public class MyProfilePage extends PredefinedActions {
	public String getHeaderText() {
		String actual= driver.findElement(By.cssSelector(".account span")).getText();
		return actual;
	}
}
