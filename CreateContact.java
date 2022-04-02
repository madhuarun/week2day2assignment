package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("test");
		driver.findElement(By.id("lastNameField")).sendKeys("leaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("testing");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("code");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is testing using locator");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		
		WebElement dropdown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This important note field is updated ");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		}

}
