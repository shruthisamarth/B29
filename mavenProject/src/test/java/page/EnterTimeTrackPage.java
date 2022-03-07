package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {

	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyTitle(WebDriverWait wait,String expected) {
		try
		{
			wait.until(ExpectedConditions.titleContains(expected));
			Reporter.log("Title is matching",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Title is Not matching",true);
			return false;
		}
	}
	
	public boolean verifyUrl(WebDriverWait wait,String expected) {
		try
		{
			wait.until(ExpectedConditions.urlContains(expected));
			Reporter.log("Url is matching",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Url is Not matching",true);
			return false;
		}
	}
	
	public boolean verifyElementDisplayed(WebDriverWait wait) {
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(logoutLink));
			Reporter.log("Logout link is displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Logout link is not displayed",true);
			return false;
		}
	}
}
