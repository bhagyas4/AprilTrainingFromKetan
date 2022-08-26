package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class HeadlessExe {
	
	WebDriver driver;
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  
	  driver.get("http://the-internet.herokuapp.com/login");
	  driver.get("https://www.google.com/");

	  
	  
	  System.out.println("working");
	  
	
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  //ChromeOptions options = new ChromeOptions();
	  ChromeOptions options = new ChromeOptions(); options.addArguments("--headless");
	  options.addArguments("--headless");
	  driver = new ChromeDriver(options);
	  //ChromeOptions options = new ChromeOptions(); options.addArguments("--headless");
	  
	  
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
	  
  }

}
