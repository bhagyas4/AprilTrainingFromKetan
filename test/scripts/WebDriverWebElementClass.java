package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebDriverWebElementClass {
	
	WebDriver driver;
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  
	  driver.get("https://nichethyself.com/tourism/home.html");
	  WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
			
		System.out.println("What is the passwrd " +password.getAttribute("value"));
		System.out.println("tag of the password  " +password.getTagName());
		
		WebElement buttonSubmit = driver.findElement(By.xpath("//form[@name='loginform']/button[contains(text(),'Submit')]"));
		
		//WebElement buttonSubmit = driver.findElement(By.cssSelector("form[name='loginform']>button[contains(text(),'Submit')]"));

		
		buttonSubmit.click();

		
	  
	
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
