package week2.day1.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		
		  driver.findElementByLinkText("Go to Home Page").click();
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]"
		  ).click(); System.out.println(driver.getCurrentUrl());
		  
		  Thread.sleep(2000);
		  
		  driver.get("http://www.leafground.com/pages/Link.html");
		  
		  WebElement find = driver.
		  findElementByLinkText("Find where am supposed to go without clicking me?");
		  System.out.println(find.getAttribute("href"));
		  
		  Thread.sleep(2000);
		 
		  
		  driver.get("http://www.leafground.com/pages/Link.html");
		  
		  WebElement broken = driver.findElementByLinkText("Verify am I broken?");
		  
		  System.out.println(broken.getAttribute("href"));
		  
		  Thread.sleep(2000);
		  
		  driver.findElementByLinkText("Go to Home Page").click();
		  System.out.println(driver.getCurrentUrl()); Thread.sleep(2000);
		  driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]"
		  ).click(); Thread.sleep(2000); System.out.println(driver.getCurrentUrl());
		  
		  driver.get("http://www.leafground.com/pages/Link.html");
		 

		driver.findElementByLinkText("How many links are available in this page?").click();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println(allLinks.size());

		driver.close();

		/*
		 * //Traversing through the list and printing its text along with link address
		 * for(WebElement link:allLinks) {
		 * 
		 * 
		 * System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 * 
		 * }
		 */

	}

}
