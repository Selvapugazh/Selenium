package COM.selva;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_s {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement mask = driver.findElement(By.id("email"));
	mask.sendKeys("selvapugazh");
	
	WebElement red = driver.findElement(By.xpath("//input[@type='password']"));
	red.sendKeys("pugazh123");
	
	 driver.findElement(By.xpath("//button[@value='1']")).click();
	
	 Thread.sleep(4000);
	 
	TakesScreenshot sd= (TakesScreenshot) driver;
	File screenshotAs = sd.getScreenshotAs(OutputType.FILE);
	File path=new File("C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Snap\\my fac.png");
    FileUtils.copyFile(screenshotAs, path);
}
}
