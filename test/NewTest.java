import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("This is in Test Method  ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is in BeforeMethod annotaion  ");

  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("This is in AfterMethd annotaion  ");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is in beforeclass annotaion  ");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is in AfterClass annotaion  ");

  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This is in BeforeTest annotaion  ");

  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("This is in aftertest annotaion  ");

  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("This is in BeforeSuite annotaion  ");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is in aftersuite annotaion  ");

  }

}
