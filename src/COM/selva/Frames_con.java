package COM.selva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_con {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	//single frames
	 WebElement findElement = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
	 driver.switchTo().frame(findElement);
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DGP");
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	//iframe frames
	 driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	 driver.switchTo().frame(iframe);
	 WebElement iframe2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	 driver.switchTo().frame(iframe2);
	 driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("IG");
	
	
	
	}

}
