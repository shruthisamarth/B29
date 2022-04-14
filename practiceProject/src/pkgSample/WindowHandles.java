package pkgSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getWindowHandle());
	    String whGoogle = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());
		String whFB = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.actitime.com");
		
		System.out.println(driver.getWindowHandle());
		String whDemo = driver.getWindowHandle();
		driver.switchTo().window(whGoogle);
		System.out.println(driver.getTitle());		
	}

}
