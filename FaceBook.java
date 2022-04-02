package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://en-gb.facebook.com/");
	
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement (By.xpath ("//a[ @data-testid='open-registration-form-button']")).click();
		//input[@type='text' and @name='firstname']
		driver.findElement (By.xpath ("//input[@name='firstname']")).sendKeys("test");
		driver.findElement (By.xpath ("//input[@name='lastname']")).sendKeys("leaf");
		driver.findElement (By.xpath ("//div[contains(text(),'Mobile number')]//following-sibling::input[contains(@aria-label,'Mobile number')]")).sendKeys("1234567890");
		driver.findElement (By.xpath ("//input[@id='password_step_input']")).sendKeys("test@123");
		WebElement eleDropdown=driver.findElement(By.xpath("//select[@title='Day']"));
		Select dd=new Select(eleDropdown);
		dd.selectByVisibleText("27");
		WebElement eleDropdown1=driver.findElement(By.xpath("//select[@title='Month']"));
		Select dd1=new Select(eleDropdown1);
		dd1.selectByVisibleText("Aug");
		WebElement eleDropdown2=driver.findElement(By.xpath("//select[@title='Year']"));
		Select dd2=new Select(eleDropdown2);
		dd2.selectByVisibleText("2000");
		driver.findElement (By.xpath ("//label[text()='Female']")).click();
		
	}

}
