package UseofActions;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffUsingActions {
	
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
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//a[@class='signin']/following-sibling::a[1]"))).build().perform();
		//act.click(driver.findElement(By.xpath("//a[@class='signin']/following-sibling::a[1]"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//table[@id = 'tblcrtac']/descendant::input[@name = 'name21df3c4b']"))).build().perform();
		//driver.findElement(By.xpath("//table[@id = 'tblcrtac']/descendant::input[@name = 'name21df3c4b']")).sendKeys("Kirti");
		//act.sendKeys(driver.findElement(By.xpath("//table[@id = 'tblcrtac']/descendant::input[@name = 'name21df3c4b']")), "Kirti").build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@class='signin']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[@class='signin']"))).perform();
		act.sendKeys(driver.findElement(By.xpath("//input[@id = 'login1']")), "seleniumpanda@rediffmail.com").perform();
		act.sendKeys(driver.findElement(By.xpath("//input[@id = 'password']")), "Selenium@123").perform();
		act.moveToElement(driver.findElement(By.xpath("//input[@class = 'signinbtn']"))).click().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@class = 'rd_logout']"))).click().perform();
	}

}
