package pageObjectAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageNicheThyself {
	
	
	// all methods of Home page here 
	
	
	// all the class level webelement here 
	
	private WebDriver driver;
	private WebElement username;
	private WebElement password;
	private WebElement submit;
	
	
	
	
	
	//constructor to invoke browser 
	
	
	public HomePageNicheThyself() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://nichethyself.com/tourism/home.html");
		 driver.manage().window().maximize();
		 username = driver.findElement(By.name("username"));
	      password = driver.findElement(By.name("password"));
		 submit = driver.findElement(By.xpath("//form[@name='loginform']/button[text()='Submit']"));
		
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		
		
		
	}



	
	
	public void login(String user , String pass) {
		
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
		submit.click();
	}
		
			
	public void logout() {
		driver.quit();
	}
				
				
			
		
		
		
		
		

}
