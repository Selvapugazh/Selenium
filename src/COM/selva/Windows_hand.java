package COM.selva;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_hand {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("PNR Enquiry"));
		Actions jk= new Actions(driver);
		jk.contextClick(ele).perform();
		
		Robot kl =new Robot();
		kl.keyPress(KeyEvent.VK_DOWN);
		kl.keyRelease(KeyEvent.VK_DOWN);
		
		kl.keyPress(KeyEvent.VK_DOWN);
		kl.keyRelease(KeyEvent.VK_DOWN);
		
		kl.keyPress(KeyEvent.VK_ENTER);
		
		
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> hj =new ArrayList<String>(set);
		
		String tUrl = driver.switchTo().window(hj.get(0)).getCurrentUrl();
		System.out.println(tUrl);
		
		
		
		
		
		
		
		
		
		
		
	}

}
