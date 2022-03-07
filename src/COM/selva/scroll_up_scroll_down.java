package COM.selva;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_scroll_down {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://joinindiancoastguard.gov.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement llik = driver.findElement(By.linkText("(//a[@target='_blank'])[5]"));
	JavascriptExecutor ui=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	ui.executeScript("arguments[0].scrollintoview();",llik);
	
	
	
	
	
	
}
}
