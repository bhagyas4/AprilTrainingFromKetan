package pageObjectAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class PONicheThySelf {
	
	HomePageNicheThyself homepage;
	
	
	
	
  @Test
  public void test() {
	 homepage.login("stc123", "12345");
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  homepage= new HomePageNicheThyself();
	  
  }
  
	  
 
 
 
	  
	  
	  
	  
  

  @AfterClass
  public void afterClass() {
	  
	  homepage.logout();
  }

}
