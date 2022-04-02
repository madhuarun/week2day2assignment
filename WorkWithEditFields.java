package week2day2;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {
	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf@gmail.com")	;
		//get default text
		String getdeftext = driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getText();
		System.out.println(getdeftext);
		Thread.sleep(5000);
		//append a text
		String getappendtext = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).getText();
		System.out.println(getappendtext);
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(getappendtext+"newtext");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(Keys.TAB);
		//clear the text
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		//check edit field is enabled or disabled
		boolean check=driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		System.out.println(check);
			}

}
