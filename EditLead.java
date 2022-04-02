package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
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
			driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("test");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("testleafglobal");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			boolean compnamedisp=driver.findElement(By.xpath("//span[contains(text(),'testleafglobal')]")).isDisplayed();
			if(compnamedisp) {
				System.out.println("company name updated");
			}
			else {
				System.out.println("company name not updated");
			}
				
			
			driver.close();

}
}
