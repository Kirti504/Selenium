package basicsofselenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Selenium_Code {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
        //System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options); 
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		
		//driver.close();
		
		//open google, flipkart, amazon, rediff, snapdeal
		
		  

	}

}
