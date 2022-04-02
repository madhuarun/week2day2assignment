package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://www.leafground.com/pages/checkbox.html");
	driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input")).click();
	driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[3]")).click();
	
	//check selenium is selected 
	boolean select=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
if(select)
{
	System.out.println("selenium is selected ");
	
}else {
	System.out.println("selenium is not selected ");
}
//deselect checked 
 boolean check1=driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).isSelected();
 boolean check2=driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).isSelected();
if(check1) {
	driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).click();
}
if(check2) {
	driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).click();
}
//select all checkboxes 

driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[1]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[2]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[3]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[4]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[5]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes')]/following-sibling::input[6]")).click();
}
}
