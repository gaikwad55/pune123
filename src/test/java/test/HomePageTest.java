package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Homepage;

public class HomePageTest extends BaseTest {
Homepage hp;
	
	@BeforeClass
	public void initObject() {
		hp=new Homepage(driver);
	}
	
		
  @Test
  public void logout() {
	  
	  hp.logout();
	  
  }
  
}
