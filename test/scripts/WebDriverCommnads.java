package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebDriverCommnads {
	
	WebDriver driver;
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  
	
	  driver.get("https://nichethyself.com/tourism/home.html");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.google.com/");
	  driver.navigate().back();
	  driver.navigate().refresh();
	  driver.getCurrentUrl();
	  System.out.println(driver.getCurrentUrl()); // return string 
	  System.out.println(driver.getPageSource());
	  //cookies 
	  
	  
	  //home work webdriver commands 
	  // windows resize //
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
