package pkgSample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Practice1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/ps/?q=tomato#!page=6");
		String xpathPotatoChips = "//a[contains(text(),'Potato Chips - Spanish Tomato')]/../../..//i";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathPotatoChips)));
		driver.findElement(By.xpath("//a[contains(text(),'Potato Chips - Spanish Tomato')]/../../..//i")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Potato Chips - Spanish Tomato')]/../../..//i"));
		File srcImg = ts.getScreenshotAs(OutputType.FILE);
		File destImg = new File("./screenshots/Img1.png");
		FileUtils.copyFile(srcImg,destImg);
		
	}
}
