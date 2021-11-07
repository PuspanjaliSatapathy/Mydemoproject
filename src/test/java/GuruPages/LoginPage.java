package GuruPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
    WebElement pagetitle,userid,password,login,reset;
    String homepagetitle;
     public  LoginPage(WebDriver driver) {
    	 this.driver=driver;
    	 pagetitle= driver.findElement(By.className("barone"));
    	 System.out.println(pagetitle.getText());
    	 userid=driver.findElement(By.name("uid"));
    	 password=driver.findElement(By.name("password"));
    	 login=driver.findElement(By.name("btnLogin"));
    	 reset=driver.findElement(By.name("btnReset"));
    	 
    	 
    	 
     }
 public void validuserlogin(String user ,String pass) throws InterruptedException {
    	 
    	 userid.sendKeys(user);
    	 password.sendKeys(pass);
    	  login.click();
    	 Thread.sleep(2000);
    	homepagetitle=driver.getTitle();
    	 
   
     }
     
     public void invaliduserlogin(String user ,String pass) throws InterruptedException {
    	 
    	 userid.sendKeys(user);
    	 password.sendKeys(pass);
    	  login.click();
    	 Thread.sleep(2000);
    	    	 
   
     }

}
