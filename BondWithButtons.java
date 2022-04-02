package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Button.html");
			driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
			driver.navigate().back();
			org.openqa.selenium.Point loc=driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
			System.out.println(loc);
			String color=driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
			System.out.println(color);
			Dimension size=driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
			System.out.println(size);
			
}
}
