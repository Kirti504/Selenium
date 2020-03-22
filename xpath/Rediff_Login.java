package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Login {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	    
		System.out.println(driver.getTitle());
		
		String actualgetTitleRediff = driver.getTitle();
		String expectedTitleRediff = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		if(expectedTitleRediff.equals(actualgetTitleRediff)) {
			
			System.out.println("pass");
			
		}else
			System.out.println("fail");
		
		System.out.println(driver.getCurrentUrl());
		
		String actualCurrentURL = driver.getCurrentUrl();
		String expectedCurrentURL = "https://www.rediff.com/";
		
		if(expectedCurrentURL.contentEquals(actualCurrentURL)) {
			
			System.out.println("pass");
		}else
			System.out.println("fail");
	    
		driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[@class = 'signin']")).click();
		
         System.out.println(driver.getTitle());
		
		String actualTitleRediffSignIn = driver.getTitle();
		String expectedTitleRediffSignIn = "Rediffmail";
		
		if(expectedTitleRediffSignIn.equals(actualTitleRediffSignIn)) {
			
			System.out.println("pass");
			
		}else
			System.out.println("fail");
		
		System.out.println(driver.getCurrentUrl());
		
		String actualCurrentURLSignIn = driver.getCurrentUrl();
		String expectedCurrentURLSignIn = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		if(expectedCurrentURLSignIn.contentEquals(actualCurrentURLSignIn)) {
			
			System.out.println("pass");
		}else
			System.out.println("fail");
	
	    
		driver.findElement(By.xpath("//div[@class = 'cell']/following::input[1]")).clear();
		driver.findElement(By.xpath("//div[@class = 'cell']/following::input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//i[@class = 'clear']/preceding::input[3]")).clear();
		driver.findElement(By.xpath("//i[@class = 'clear']/preceding::input[@id ='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='password']/following-sibling::input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//a[@class ='rd_setting_panel']/following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//a[@class ='logo']/following::b[1]")).click();

	}

}