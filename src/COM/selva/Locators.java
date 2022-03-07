package COM.selva;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
		
		WebDriver name=new ChromeDriver();
		name.get("https://www.facebook.com/");
		name.manage().window().maximize();
		
		
		
		WebElement king = name.findElement(By.id("email"));
	    king.sendKeys("joker");
	    WebElement line = name.findElement(By.xpath("//input[@type='password']"));
	    line.sendKeys("152kil");
	    name.findElement(By.xpath("//button[@value='1']")).click();
	    
			}
    }
