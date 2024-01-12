package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropDown {
	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();

		 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 //5 adults
	/*	 driver.findElement(By.id("hrefIncAdt")).click();
		 driver.findElement(By.id("hrefIncAdt")).click();
		 driver.findElement(By.id("hrefIncAdt")).click();
		 driver.findElement(By.id("hrefIncAdt")).click();
		 driver.findElement(By.id("btnclosepaxoption")).click();*/
		 
		 //we dont use this above method
		 
		 for(int i=1;i<5;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}
}
