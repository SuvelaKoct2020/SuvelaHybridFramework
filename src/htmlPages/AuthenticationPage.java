package htmlPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class AuthenticationPage extends PredefinedActions{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	public void enterEmailId(String emailId) {
		
		System.out.println("Create new account");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create"))).sendKeys(emailId);
	}
	public CreateAccountPage clickOnCreateAccount() {
		System.out.println("Click on Create- an account");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#SubmitCreate"))).click();
		return new CreateAccountPage();
	}
}
