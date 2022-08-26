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

public class WikipediaTestWithRelativeLoctior {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.wikipedia.org/");
	  
	 // WebElement englishLink = driver.findElement(By.tagName("a").toLeftOf.with(By.id("js-link-box-ja")).toAbove(By.id("js-link-box-es")).toBelow(By.xpath("//*[@class ='central-textlogo-wrapper']")));
	  //driver.findElement(By.id("js-link-box-en")).click();
	  
	  driver.findElement(By.name("search")).sendKeys("Selenium");
	  driver.findElement(By.id("searchButton")).click();
	  //driver.manager.windows.setSize(new Dimension(1530,883)); // try this one 
	  String expectedText = "Selenium";
	  String  actualText = driver.findElement(By.id("firstHeading")).getText();
	  
	 assertEquals(actualText, expectedText, "Yes the text shown on page is correcct Test case pass");
	  
  }
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\geckodriver.exe");
	  driver =  new FirefoxDriver();
	  

	  
	  

	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
