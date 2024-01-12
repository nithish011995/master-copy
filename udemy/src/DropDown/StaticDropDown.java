package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 
		 Select dropdown = new Select(StaticDropDown);
		 
		 //This below method applied only when tagname is select
		 
		// dropdown.selectByIndex(3);//or
		 dropdown.selectByValue("USD");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 
		 
		}
}
