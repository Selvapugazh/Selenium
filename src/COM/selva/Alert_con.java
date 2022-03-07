package COM.selva;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_con {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
	
	WebDriver jean=new ChromeDriver();
	jean.get("http://demo.automationtesting.in/Alerts.html");
	jean.manage().window().maximize();
	Thread.sleep(2000);
	jean.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	jean.switchTo().alert().accept();
	
	
	//confirm
	Thread.sleep(2000);
	jean.findElement(By.linkText("Alert with OK & Cancel")).click();
	jean.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	jean.switchTo().alert().dismiss();
	Thread.sleep(2000);
	
	
	//prompt
	jean.findElement(By.linkText("Alert with Textbox")).click();
	WebElement findElement = jean.findElement(By.xpath("//button[@class='btn btn-info']"));
	findElement.click();
	Thread.sleep(2000);
	
	Alert a = jean.switchTo().alert();
	
	a.sendKeys("spiderman");
	a.dismiss();
	
}
}
