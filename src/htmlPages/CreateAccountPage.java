package htmlPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class CreateAccountPage extends PredefinedActions {
	WebDriverWait wait;
	public void enterYourInfo() {
		wait = new WebDriverWait(driver, 30);
		System.out.println("Fill account information");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".navigation_page")));
		
		System.out.println("Select gender");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender1"))).click();
		
		System.out.println("Enter firstname");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='customer_firstname']"))).sendKeys("John");
		
		System.out.println("Enter lastname");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer_lastname"))).sendKeys("James");;
		
		System.out.println("Enter password");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#passwd"))).sendKeys("1234567890");;
		
		System.out.println("Select date of birth");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#uniform-days")));
		Select s = new Select(driver.findElement(By.cssSelector("#days")));
		s.selectByValue("10");
		
		System.out.println("Select birth month");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#uniform-months")));
		s=new Select(driver.findElement(By.cssSelector("#months")));
		s.selectByValue("10");
		
		System.out.println("Select birth year");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#uniform-years")));
		s = new Select(driver.findElement(By.cssSelector("#years")));
		s.selectByValue("2010");
		
		System.out.println("Enter company name");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#company"))).sendKeys("Google");
		
		System.out.println("Enter your address");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#address1"))).sendKeys("123 Main ST");
		
		System.out.println("Enter city");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#city"))).sendKeys("Chicago");
		
		System.out.println("Select state");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#uniform-id_state")));
		s = new Select(driver.findElement(By.cssSelector("#id_state")));
		s.selectByVisibleText("Illinois");
		
		System.out.println("Enter postcode");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#postcode"))).sendKeys("60628");
		
		System.out.println("Enter additional information if applicable");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#other"))).sendKeys("Have a good day!");
		
		System.out.println("Enter phone number");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone"))).sendKeys("654890");
		
		System.out.println("Enter mobile number");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone_mobile"))).sendKeys(" +1 202 555 0156");
		
		
		
	}
	public MyProfilePage clickOnRegister() {
		wait = new WebDriverWait(driver, 30);
		System.out.println("Click on Register");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#submitAccount"))).click();
		return new MyProfilePage();
	}

}
