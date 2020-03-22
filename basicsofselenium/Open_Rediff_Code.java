package basicsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Rediff_Code {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		

	}

}
