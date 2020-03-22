package newconcepts_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_Concepts {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

	}

}
