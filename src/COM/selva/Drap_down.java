package COM.selva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drap_down {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		
		Thread.sleep(2000);		
		WebElement hg = driver.findElement(By.xpath("//input[@tabindex='0']"));
		hg.sendKeys("007");
		Thread.sleep(2000);
		WebElement ht= driver.findElement(By.xpath("//input[@name='lastname']"));
		ht.sendKeys("007");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kar@123");
		Thread.sleep(2000);
		WebElement red = driver.findElement(By.id("day"));
		Select green =new Select(red);
		green.selectByIndex(24);
		   
		WebElement cat = driver.findElement(By.id("month"));
		Select gf= new Select(cat);
		gf.selectByVisibleText("Jun");
		
		WebElement jocker = driver.findElement(By.id("year"));
		Select nl= new Select(jocker);
		nl.selectByValue("2000");
		
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
