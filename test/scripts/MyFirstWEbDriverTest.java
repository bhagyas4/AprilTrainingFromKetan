package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWEbDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver(); 
		//driver.get("https://nichethyself.com/tourism/home.html");
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://nichethyself.com/tourism/home.html");


		
		// nothing is implemneted in the Webdriver interface so can not create object nithing will be there 
		//chromedriver is a class and ti is child of webdriver interface
		//
		
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
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");


	
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

	

		
	}
	

	}

//Test ng is unit testing framework 
// what is framework > gives good reports , mehtods , listeners , methods etc 
// junit .
//for python you have pytest , unit test 
//punit for php 
//Jasmine, Mocha, Chai == Javascript
//Cedric NExt gerneration java testing by him read on google
//Testng need jar file , 


