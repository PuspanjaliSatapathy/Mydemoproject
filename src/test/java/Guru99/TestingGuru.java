package Guru99;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GuruPages.BankingHomePage;
import GuruPages.LoginPage;
import MyUtilty.Invokebr;


public class TestingGuru {
	
	
	WebDriver driver;
	  @Test(groups = {  "Smoke" })
	  //Verify Home page is loaded after successful login
	  public void loginwithvaliduser() throws InterruptedException {
		  Thread.sleep(2000);
		  String strUrl = driver.getCurrentUrl();
	      System.out.println(strUrl);
	      String Expectedhometitle="Guru99 Bank Manager HomePage";
	      
	   //   System.out.println(guru.homepagetitle);
	     //Comments in this test case 
	     //Dont use driver. API in test NG test cases
	     //User assertion in the test cases
	      }
	  
	  @Test(groups = { "sanity", "Smoke","regression" })
	  //Verify in Home page the manager ID is same as it logged in
	  public void homepage_elements() throws InterruptedException {
		  BankingHomePage homepage= new BankingHomePage(driver);
		  String ActualmngrId= homepage.managerid();
		  assertTrue(ActualmngrId.contains("mngr364831"));
		  
	  }
	  
	  @Test(groups = { "sanity" })
	  //Verify home page is loading and Logout is working  
	  public void logout() throws InterruptedException {
		  BankingHomePage home= new BankingHomePage(driver);
		  String Postlogout =home.logout();
		  Assert.assertEquals(Postlogout,"Guru99 Bank Home Page");
		  
		  
	  }
	  
	  @BeforeMethod(groups = {"regression","smoke","sanity"})
	  public void beforeMethod() throws InterruptedException {
		  driver = Invokebr.openbrowser("http://demo.guru99.com/V4", "chrome");
		  LoginPage guru= new LoginPage(driver);
		  guru.validuserlogin("mngr364831","qubytym");
			 
		    /*"http://www.demo.guru99.com/V4", "chrome");*/

	  }

	  @AfterMethod(groups = {"regression","smoke","sanity"})
	  public void afterMethod() {
		  driver.manage().deleteAllCookies();
		    driver.close();
	  }

	 

}
