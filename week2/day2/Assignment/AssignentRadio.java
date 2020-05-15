package week2.day2.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignentRadio

{

	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		driver.manage().window().maximize();
		
		driver.findElementById("yes").click();
		
		if (driver.findElementById("yes").isSelected())
		{
			System.out.println("The radio button is selected");
		}
		else
		{
			System.out.println("The radio button is not selected");
		}
		
		
		
		  WebElement defaultname = driver.findElementByXPath("//input[@name='news' and @value='1']");
		  
		  if (defaultname.isSelected())
		  { 
			  WebElement getValue = driver.findElementByXPath("//label[@for='Checked']");
			  
				String value = getValue.getAttribute("for");
				System.out.println("The default value is :" + value);
		  }
		  else 
		  {
			  WebElement getValue = driver.findElementByXPath("//label[@for='Unchecked']");			  
				String value = getValue.getAttribute("for");
				System.out.println("The not selected value is:" + value);
			  
		  }
		  
		  WebElement ageGroup = driver.findElementByXPath("(//input[@name='age'])[1]");
		  if(!ageGroup.isSelected())
		  {
			  ageGroup.click();
		  }
		  System.out.println("Clicked age group is:" + ageGroup.getText());
		  
		driver.close();
		
	
}
}

