package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CheckBOxSelection {
	
	WebDriver driver;
	
	
	
  @Test
  
  
  public void learningWebDriverCommands() {
	  
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  driver.manage().window().maximize();
	  
	  WebElement englandCheckbox = driver.findElement(By.xpath("//label[text()='England']/input"));
	  
	  if(!englandCheckbox.isSelected()){
		  englandCheckbox.click();
		  System.out.println("selected");
	  }
	  
	  
	
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
