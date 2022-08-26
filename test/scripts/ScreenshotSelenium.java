package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ScreenshotSelenium {
	
	WebDriver driver;
	int[] as = new int[5];
	 ArrayList   list = new ArrayList(12);
	 
	 
	  
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  
	  list.add(54);
	  
	
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  }
  
  //int[] as = int[5];
  
  
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
