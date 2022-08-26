package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class WaitInSelenium {
	
	WebDriver driver;
	// explicit wait 
	WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	
  @Test
  public void learningexplicitwaitwithlocator() {
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	 //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  // you shuld go for explicite wait 
	  // using due to backword compatibility ..many projects using it and there cases shoul dnot fail.
	  // you do not need implicitwait 
	  
	  
	
  }
  
  // below test not good practicce 
  
  @Test
  public void learningexplicitwaitwithElement() {
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
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
