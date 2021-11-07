package GuruPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankingHomePage {
	
	WebDriver driver;
	WebElement selenium,insurance,agile,bankpoject,securityproj,telecome,paymentgateaway,newtours,seo;
	WebElement managerid,managertab,Newcustomer,Editcus,deletecus,newacct,editacct,deleteacct,ministmt,custstmt,logout;
	
	
	public BankingHomePage(WebDriver driver) {
		this.driver=driver;
		
		managerid= driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td[1]"));
			
		//insurance=driver.findElement(By.linkText("Insurance Project"));
		//selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@aria-expanded='false']"));

		logout=driver.findElement(By.linkText("Log out"));
		
	
	}
	public String managerid() throws InterruptedException {
		Boolean managerID = managerid.isDisplayed();
	    System.out.println(managerid.getText());
	    String Manageridtext =managerid.getText();
	    return Manageridtext;
		
	}
	public String logout() {
		logout.isDisplayed();
		System.out.println(logout.getText());
		logout.click();
		driver.switchTo().alert().accept();
		String loginpagetitle = driver.getTitle();
		return loginpagetitle;
	}

}
