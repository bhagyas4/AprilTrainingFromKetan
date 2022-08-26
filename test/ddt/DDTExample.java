package ddt;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DDTExample {
	
	
  // this is taken by ketan in class 
  
	
	WebDriver driver;
  
  @Test(dataProvider = "LoginData")
  
  public void loginToNicheThyselfCSV(String user, String pass) throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		username.submit();
  }
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	  
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider(name = "LoginData")
  public void dp() {
// this method should return 2 diemntionn arrewy and get code form      
    
  }
  
  //Domain specific language 
  // class created data is created or class is created with 
  //you need marker so that ddt take data etween these lines only 
  //NTStartEnd 
  // data from xls 
}
