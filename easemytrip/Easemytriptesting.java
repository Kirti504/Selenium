package easemytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Easemytriptesting {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver(options);
		
	
		
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@id = 'spnMyAcc']"))).build().perform();
		driver.findElement(By.xpath("//a[@class ='btn_signin']")).click();
		driver.findElement(By.xpath("//input[@id='txtusername']")).sendKeys("8327752761");
		driver.findElement(By.xpath("//input[@id=Password1']'")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='buttonLogin']")).click();
		act.moveToElement(driver.findElement(By.xpath("//span[@id ='welcome-det-User']"))).build().perform();
		driver.findElement(By.xpath("//span[@id = 'spnLogoutPnl']/child::a[2]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
