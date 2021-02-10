package htmlPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class HomePage extends PredefinedActions {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	public AuthenticationPage clickOnSignIn() {
		
		System.out.println("Click on Sign-in");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login"))).click();
		return new AuthenticationPage();
	}
}
