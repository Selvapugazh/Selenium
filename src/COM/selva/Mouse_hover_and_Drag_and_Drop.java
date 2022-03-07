package COM.selva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_and_Drag_and_Drop {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement element = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
Actions gh=new Actions(driver);
gh.moveToElement(element).perform();

Thread.sleep(3000);
WebElement fin= driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
Actions mm=new Actions(driver);
mm.contextClick(fin).perform();

Thread.sleep(3000);

driver.navigate().to("https://demoqa.com/droppable/");
WebElement find = driver.findElement(By.id("draggable"));
WebElement jak = driver.findElement(By.id("droppable"));
 Actions ki= new Actions(driver);
 ki.dragAndDrop(find, jak).perform();
}
}
