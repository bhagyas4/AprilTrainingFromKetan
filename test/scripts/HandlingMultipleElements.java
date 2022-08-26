package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HandlingMultipleElements {
	
	WebDriver driver;
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  
	  driver.get("https://www.google.com/");
	  
	  
		 System.out.println("with enhanced  for loop");

	  
	  List <WebElement> links	= driver.findElements(By.tagName("a"));
	  
	/*for(WebElement oneLink:links) {
		  System.out.println(oneLink.getText() + " - " +oneLink.getAttribute("href"));
	  }*/
	 
	 System.out.println("with another for loop");
	  
	  for(int i=0;i < links.size(); i++) {
		  
		 System.out.println(links.get(i).getText() + " - " +links.get(i).getAttribute("href"));
	 
		  
	  }
  }
  

		  
		  
		  
		  
	  
	  
	  
	  
	  
	  //get all the links from the page
	  //get all the images 
	  
	
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
