package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//dropdown for index
		WebElement eleDropdownindex=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dd1=new Select(eleDropdownindex);
		dd1.selectByIndex(1);
		

		//dropdown for text
		WebElement eleDropdowntext=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dd2=new Select(eleDropdowntext);
		dd2.selectByVisibleText("Appium");
		
		//dropdown for value
				WebElement eleDropdownvalue=driver.findElement(By.xpath("//select[@id='dropdown3']"));
				Select dd3=new Select(eleDropdownvalue);
				dd3.selectByValue("3");
				
		//dropdown for options
				WebElement eleDropdownoptionget=driver.findElement(By.xpath("//select[@class='dropdown']"));
				Select dd4=new Select(eleDropdownoptionget);
				System.out.println("The no of options in dropdown is :"+dd4.getOptions().size());
				
		//use sendkeys to select
		
				driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/ancestor::select")).sendKeys("Loadrunner");
				
				//select your programs multiple
				
				WebElement sel=driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
				Select sel1=new Select(sel);
				sel1.selectByIndex(2);
				sel1.selectByIndex(3);
				
	}

}
