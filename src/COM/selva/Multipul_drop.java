package COM.selva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipul_drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SELVAM KAVITHA\\eclipse-workspace\\SELENIUM_\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	 WebElement find = driver.findElement(By.xpath("//select[@style='width:200px']"));
	Select fk=new Select(find);
	boolean lk = fk.isMultiple();
	System.out.println("multiple drap down "+lk);
	
  List<WebElement> options = fk.getOptions();     
  for (WebElement web : options) {
	  System.out.println(web.getText());
}
	int l = options.size();
	System.out.println(l);
	for (int i = 0; i < l; i++) {
		
		if (i==1||i==5||i==3) {
			fk.selectByIndex(i);
		}
	
		}
	
	
	System.out.println("********************************onlyselected******************************");
	
	List<WebElement> allSelectedOptions = fk.getAllSelectedOptions();
	for (WebElement Element : allSelectedOptions) {
		System.out.println(Element.getText());
		}
	System.out.println("********************************firstselected******************************");
	
	WebElement firstSelectedOption = fk.getFirstSelectedOption();
  System.out.println(firstSelectedOption.getText());
}
}
