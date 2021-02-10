package testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import htmlPages.AuthenticationPage;
import htmlPages.CreateAccountPage;
import htmlPages.HomePage;
import htmlPages.MyProfilePage;

public class LoginTest {
	@Test
	public void login() {
		PredefinedActions.start();
		
		HomePage homePage = new HomePage();
		AuthenticationPage authenticationPage=homePage.clickOnSignIn();
		authenticationPage.enterEmailId("abc@gmail.com");
		CreateAccountPage createAccountPage=authenticationPage.clickOnCreateAccount();
		createAccountPage.enterYourInfo();
		MyProfilePage myProfilePage=createAccountPage.clickOnRegister();
		String actual=myProfilePage.getHeaderText();
		
		String expected="John James";
		Assert.assertEquals(actual, expected,"Verification failed");
	}
}
