package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookpage {
	
	public static WebDriver driver;
	public static Select facebook;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean FBlogo = driver.findElement(By.xpath("//div[@id = 'blueBarDOMInspector']/descendant::i[1]")).isDisplayed();
		if(FBlogo == false) {
			System.out.println("logo is displyed");
		} else
			
			System.out.println("logo not displayed");
		boolean FBfirstname = driver.findElement(By.xpath("//input[@id = 'u_0_m']")).isEnabled();
		if(FBfirstname == true) {
			System.out.println("enabled");
		}else
			System.out.println("disabled");
		
		boolean FBRBFe = driver.findElement(By.xpath("//input[@id = 'u_0_6']")).isSelected();
		
		if (FBRBFe == true) {
			System.out.println("Selected");
		}
		else
			System.out.println("Not Selected");
		facebook = new Select(driver.findElement(By.xpath("//select[@id = 'day']")));
		facebook.selectByVisibleText("20");
		facebook = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
		facebook.selectByVisibleText("Mar");
		facebook = new Select(driver.findElement(By.xpath("//select[@id = 'year']")));
		facebook.selectByVisibleText("1987");

		//isDisplayed() 
		
		
	}

}
