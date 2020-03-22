package applicationofjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Browsers {
   public static WebDriver driver;
	public static void main(String[] args) {
		String browser = "InternetExplorer";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.close();			
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\BROWSER DRIVERS\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://paytm.com");
			driver.close();		
			
		} else if(browser.equals("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get("https://snapdeal.com");
			driver.close();
			
			} 
		else {
				System.out.println("none of the browser are working");
			}
				
		

	}

}
