package actionClassAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ActionsAssgn2 {
	
	WebDriver driver;
	WebDriverWait wait ;
	
	/*ssignment2(Most Important Assignment for entire training):
- In triphobo.com implement the drag and drop automation
- Click on "Plan Your Next Vacation" button on the homepage
- Type Where do you want to go? field, Houston, Scotland, United Kingdom
- Select Start and End date of your journey
- Click on button "Start Planning"
- Click on "Next -> About Your Trip" button on the right hand side of the screen
- Click on "Skip to About You"
- Click "Skip to Trip Overview"
- Click on "Edit this plan"
- If any unwanted pop-up comes here e.g. "did you like suggestion trip plan?" click on X (i.e. close it)
- Now drag one activity on day1 to day 3
- Click on Save plan -> Finish Planning */

	
	
	
  @Test
  public void learningWebDriverCommands() {
	  driver.get("https://www.triphobo.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  WebElement privacyPopup  = driver.findElement(By.className("qc-cmp2-publisher-logo-container"));
	  WebElement agreeBtn = driver.findElement(By.xpath("//span[text()='Agree']"));
	  
		try {
		  
		  if(privacyPopup.isDisplayed()) {
			  
			  agreeBtn.click();
			  
		  }else 
			  System.out.println("popupnotgiven");
		}catch (NoSuchElementException e ) {
			System.out.println("Agree to terms and condition msg not given ");
		}
		  
		  
	  

	  WebElement planTripBtn = driver.findElement(By.xpath("//a[@href='/trip']"));
	  planTripBtn.click();
	  WebElement searchText  = driver.findElement(By.xpath("//input[@placeholder='Where do you want to go?']"));

	  searchText.sendKeys("Scot");
	  
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  //WebElement HovertoScotland = driver.findElement(By.xpath("//span[text()='Scotland, United Kingdom']"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Scotland, United Kingdom']")));
	  WebElement HovertoScotland = driver.findElement(By.xpath("//span[text()='Scotland, United Kingdom']"));

	  
	  
	  Actions builder = new Actions( driver);
	  
	  builder.moveToElement(HovertoScotland).click().build().perform();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Aberdeen']")));

	  WebElement aberdeen  = driver.findElement(By.xpath("//div[@title='Aberdeen']"));
	  Actions builder1 = new Actions( driver);

	  
	  builder1.moveToElement(aberdeen).click().build().perform();


	  driver.getTitle();
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
