package LearnTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotaitons2 {
  @Test(groups= {"Regression" ,"P3" , "Car"})
  public void test1() {
	  
	  System.out.println("Test1 method  in TestNGAnnotaitons2 ");

  }
  
  
  @Test(groups= {"Regression" ,"P1" , "Product"})
  public void test2() {
	  
	  System.out.println("Test2  method  in TestNGAnnotaitons2 ");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod in TestNGAnnotaitons2 ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Afternethod  in TestNGAnnotaitons2 ");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass in TestNGAnnotaitons2 ");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFterCalss in TestNGAnnotaitons2 ");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest method  in TestNGAnnotaitons 2");

  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("AfterTest  method  in TestNGAnnotaitons2 ");

  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("BeforeSuite method  in TestNGAnnotaitons 2");

  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("AftereSuite method  in TestNGAnnotaitons 2");

  }

}
