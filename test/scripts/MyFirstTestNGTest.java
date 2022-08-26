package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	
	WebDriver driver;
	
	// AAA > Triple A framework arrenge , take action ( Steps to take requirements) , assert
	
  @Test
  public void testcase() {
	  
	  driver.get("https://nichethyself.com/tourism/home.html");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		user.submit();
		
		String expectedTitle = "My account1"; // your tests should have failed test cases as well as pass everything pass will not be good 
		String actualTitle = driver.getTitle();
		
		// try to make it pass also and make it fail also 
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Login failed ");
		}
		
		assertEquals(expectedTitle,actualTitle);
		
		assertEquals(expectedTitle,actualTitle,"Login was not successful");
  }
		
		
	  
	  
  
  
/*@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");

		
		String browser = "CH";
		
		
		if(browser.equals("CH")) {
			driver = new ChromeDriver();
		}else if (browser.equals("FF")) {
			driver = new FirefoxDriver();
		}
			else {
				driver = new ChromeDriver();
			}
		
  }*/
  
  @Test
  public void atest() {
	  driver.get("http://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Learning selenium");
  }

 /* @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }*/
  
 
  

  @BeforeClass
  public void beforeClass() {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");

		
		String browser = "CH";
		
		
		if(browser.equals("CH")) {
			driver = new ChromeDriver();
		
		}else if (browser.equals("FF")) {
			driver = new FirefoxDriver();
		}
			else {
				driver = new ChromeDriver();
			}
		
  }
  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
}


