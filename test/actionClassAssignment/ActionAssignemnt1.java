package actionClassAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ActionAssignemnt1 {
	
	WebDriver driver;
	WebDriverWait wait ;
	
	/*Assignment1 (In WebDriver - moveToElement)
	- Anna assignment
	1. goto https://www.annauniv.edu/department/index.php
	2. Goto "Faculty Of Mechanical Engineering" and click on "Institute for Energy Studies"
	3. Verify the page title.
	4. Goto "Projects" options and Click "Consultancy Projects"
	5. Verify the page title.*/
	
	
	
  @Test
  public void learningWebDriverCommands() {
	  driver.get("https://www.annauniv.edu/department/index.php");
	  driver.manage().window().maximize();
	  WebElement mechnicalEngg = driver.findElement(By.name("link11"));
	  WebElement instEnergeryStydy  = driver.findElement(By.id("menuItem43"));

	  
	  Actions builder = new Actions( driver);
	  
	  builder.moveToElement(mechnicalEngg).moveToElement(instEnergeryStydy).click().build().perform();
	  driver.getTitle();
	  System.out.println("title of age " +driver.getTitle());
	  System.out.println("title of url is  " +driver.getCurrentUrl());
	  
	  String expectedTitle = "Anna University - Manufacturing System Management";
	  String  actualTitle  = driver.getTitle();
	  assertEquals(expectedTitle,actualTitle,"Title not correct" );
	  
	  WebElement facilityPage = driver.findElement(By.linkText("Facilities"));
	  facilityPage.click();
	  
	  String expectedTitle1 = "Facilities";
	  String  actualTitle1  = driver.getTitle();
	  assertEquals(expectedTitle1,actualTitle1,"Title not correct" );
	  



	  
	  
	  
	  
	  
	  
	
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
