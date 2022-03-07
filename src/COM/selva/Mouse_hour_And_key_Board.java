package COM.selva;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hour_And_key_Board {
	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.tnpsc.gov.in/");
	driver.manage().window().maximize();
	
	
	WebElement element = driver.findElement(By.xpath("(//a[@class='confirmation'])[5]"));
	Actions sd=new Actions(driver);
	sd.contextClick(element).perform();
	  Thread.sleep(2000);
	  
	  
	  //key board
	Robot kl= new Robot();
	kl.keyPress(KeyEvent.VK_DOWN);
	kl.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	kl.keyPress(KeyEvent.VK_DOWN);
	kl.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	kl.keyPress(KeyEvent.VK_ENTER);

	
	
	
	
	
	
	}

}
