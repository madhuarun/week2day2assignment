package week2day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead1 {

	public static void main(String[] args) throws InterruptedException {
		
	// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//label[text()='Email Address:']/following-sibling::div/input")).sendKeys("testleaf@hotmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		//capturing all the fields of lead
		String  leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println( leadid);
		String fname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println(fname);
		String lname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a")).getText();
		System.out.println(lname);
		String compname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a")).getText();
		System.out.println(compname);
		String email = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-primaryEmail']/a")).getText();
		System.out.println(email);
		
		//now clicking the lead id 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//duplicate lead 
		String viewleadfname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(viewleadfname);
		String viewleadlname=driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		System.out.println(viewleadlname);
		
		if(fname.equals(viewleadfname)){
			
			System.out.println("names match");
		}
		else {
			System.out.println("names do not match");
			
		}
		driver.close();
	}

}
