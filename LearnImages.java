package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImages {
	public static void main(String[] args) throws InterruptedException {
		
	       WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Image.html");
			driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
			driver.navigate().back();
			String image=driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("naturalWidth");
			if(image.equals("0"))
					{
				System.out.println("The image is broken");
			}
			else {
				System.out.println("The image is not broken");
			}
			//driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).pe;
			Actions builder=new Actions(driver);
			builder.sendKeys(driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")), Keys.ENTER).perform();
			
			
			
}
}
