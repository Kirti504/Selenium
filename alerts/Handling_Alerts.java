package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda");
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("password"))));
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@class ='signinbtn']")).click();
		
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss(); for dismissing an alert
		
		

	}

}
