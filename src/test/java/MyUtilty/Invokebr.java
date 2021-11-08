package MyUtilty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokebr {
		

	public static WebDriver openbrowser(String url, String browsername) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\Selenium-Download\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 System.out.println("chrome browser");
		 driver.get(url);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public  void closebrowser(WebDriver driver) throws InterruptedException{
		
		driver.close();
	}




}
