package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HW_1403 {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("spnMyAcc"))).build().perform();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("btn_signin"))));
		driver.findElement(By.className("btn_signin")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("txtusername"))));
		driver.findElement(By.id("txtusername")).sendKeys("8327752761");
		driver.findElement(By.id("Password1")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'buttonLogin']")).click();
		
		
		
		

	}

}
