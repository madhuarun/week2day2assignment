package week2day2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {
	
	public static void main(String[] args) throws InterruptedException {
		
	       WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Link.html");
			driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
			driver.navigate().back();
			
			//find the page needed to navigate without clicking 
			
			String attr=driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
			System.out.println("This link is directed to "+attr);
			
			//verify broken link
			
			driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
			String title=driver.getTitle();
			if(title.equals("404 Not Found")){
				System.out.println("Link is Broken");
				
			}
			else
			{
				System.out.println("Link is working");
			}
			driver.navigate().back();
			
			//go to home page (Interact with same link)
			
			
			driver.findElement(By.xpath("//label[@for='position']/preceding-sibling::a")).click();
			driver.navigate().back();
			
			//How many links are vaailable in this page 
			
			java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
			//int linksize = driver.findElements(By.tagName("a")).size();
			
			System.out.println(links.size());
			
					
			

}
}
