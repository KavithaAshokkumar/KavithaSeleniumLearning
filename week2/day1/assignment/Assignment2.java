package week2.day1.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException

	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		driver.findElementById("email").sendKeys("kavithaashokumar@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Text Appended", Keys.TAB);

		/// System.out.println("Print check");

		// driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");

		WebElement getValue = driver.findElementByXPath("//input[@value='TestLeaf']");
		String value = getValue.getAttribute("value");
		System.out.println(value);

		// System.out.println("Print after check");

		driver.findElementByXPath("//input[@value='Clear me!!']").clear();

		WebElement checkEditable = driver.findElementByXPath("//label[contains(text(),'Confirm that edit field is disabled')]/following-sibling::input");
		boolean edit = checkEditable.isEnabled();
		
 		  System.out.println(edit);
 		  if (edit == false)
 			  
	{
 			  System.out.println("The field is disabled");
 			  
	}
 		  else
 			  System.out.println("The field is enabled");
 		 driver.close();
 		 
	}
	
	}
