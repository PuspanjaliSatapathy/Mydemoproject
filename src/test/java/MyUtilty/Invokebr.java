package MyUtilty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokebr {
		

	public static WebDriver openbrowser(String url, String browsername) {
		WebDriver driver = null;
		String projectpath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\src\\test\\resources\\drivers\\chromedriver.exe ");
		 driver= new ChromeDriver();
		 System.out.println("chrome browser");
		 System.out.println("testing1");
		 System.out.println("testing1");
		 System.out.println("testing2");
		
		
		 driver.get(url);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public  void closebrowser(WebDriver driver) throws InterruptedException{
		
		driver.close();
	}




}
