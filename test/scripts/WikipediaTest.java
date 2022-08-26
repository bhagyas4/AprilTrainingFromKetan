package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class WikipediaTest {
	
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\geckodriver.exe");
	  driver =  new FirefoxDriver();
	  driver.get("https://www.wikipedia.org/");
	  driver.findElement(By.id("js-link-box-en")).click();
	  driver.findElement(By.name("search")).sendKeys("Selenium");
	  driver.findElement(By.id("searchButton")).click();
	  String expectedText = "Selenium";
	  String  actualText = driver.findElement(By.id("firstHeading")).getText();
	  
	 assertEquals(actualText, expectedText, "Yes the text shown on page is correcct Test case pass");
	  

	  
	  

	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
