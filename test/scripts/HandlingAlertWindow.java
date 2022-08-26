package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.fail;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class HandlingAlertWindow {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	
	
	
  @Test
  public void handleAlert() {
	  
		String parentWindow = driver.getWindowHandle();
		String customisedTour = null ;

	  driver.get(" https://nichethyself.com/tourism/home.html");
	  WebElement customisedtour = driver.findElement(By.xpath("//a[@href='customised.html']"));
	  
	  customisedtour.click();// click on customised tur link 
	  
	  
	  //Select "Home Stay" in preferred stay dropwdown/combo.
	  //String windowHandle = driver.getWindowHandle(); // this is for parent window 
	  //System.out.println("handlename" +windowHandle);
	  //driver.switchTo().window(windowHandle);
	  
	  
	  Set <String> allWindiowHandles = driver.getWindowHandles();
	  
	  System.out.println("Number of windowHandls" +allWindiowHandles.size());
	  
	  for(String window :allWindiowHandles ) {
		  
		  if(!window.equals(parentWindow)) {
			  try {
			  driver.switchTo().window(window);
			  Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control' and @id='days']")));
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,250)", "");
			  select.selectByVisibleText("Home Stay");
			  //Click on England checkbox
			  
			  WebElement englandChekbx = driver.findElement(By.xpath("//label[text()='England']/input"));
			  
			  if(! englandChekbx.isSelected()) {
				  englandChekbx.click();
			  }
			  
		  } catch(NoSuchWindowException e ) {
			  fail("There is no window present ");
		  }
		  
	  
	  
	  WebElement contactus = driver.findElement(By.xpath("//button[text()='Contact us!']"));
	  contactus.click();
	  
	  try {
	  driver.switchTo().window("Contact" );// for this window we havea windowName so no need for handle 
	  
	  driver.findElement(By.xpath("//div[@class='card-header']//span")).click();
	  try {
	  Alert alert = driver.switchTo().alert();
	  alert.sendKeys("London");
	  alert.accept();
	  }catch(NoSuchWindowException e ) {
		  fail("Window not present ");
	  }
	  }catch (NoSuchWindowException e ){
		  fail("Window not present");
	  }
	  driver.close();
		  }
	  }
		
	  }
		  
		  
	  
	  
	  
			
	  
	  
	  
	  
	  
	  //catch (NoSuchWindowException e){
		//  fail("No such window present ");
	  
	  
	  
		  
	  
  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
			 
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
