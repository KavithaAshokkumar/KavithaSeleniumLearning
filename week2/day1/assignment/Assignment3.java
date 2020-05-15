package week2.day1.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElementByXPath("//label[contains(text(),'Click button to travel home page')]/following-sibling::button").click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
	
		WebElement location = driver.findElementById("position");
		System.out.println(location.getLocation());
		
		WebElement color = driver.findElementById("color");
		System.out.println(color.getCssValue("background-color"));
		
		WebElement size = driver.findElementById("size");
		System.out.println(size.getSize());
		
		 driver.close();

	}

}
