package week2.day2.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCheckBox {
	
	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[2]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		System.out.println("Known languages are selected");
	
		WebElement check = driver.findElementByXPath("(//input[@type='checkbox'])[6]");
		boolean toCheck = check.isSelected();
		if (toCheck == true)
		{
			System.out.println("Selenium is checked");
		}
		else
		{
			System.out.println("Selenium is unchecked");
		}
		
		WebElement deSelect1 = driver.findElementByXPath("(//input[@type='checkbox'])[7]");
		WebElement deSelect2 = driver.findElementByXPath("(//input[@type='checkbox'])[8]");
		
		boolean todeSelect1 = deSelect1.isSelected();
		if (todeSelect1 ==true)
		{
			deSelect1.click();
			System.out.println("The checkbox is deselected");
			}
		else
		{
			System.out.println("The checkbox is already unchecked");
		}
		
		boolean todeSelect2 = deSelect2.isSelected();
		if (todeSelect2 ==true)
		{
			deSelect2.click();
			System.out.println("The checkbox is deselected");
			}
		else
		{
			System.out.println("The checkbox is already unchecked");
		}
		
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
	
	}
	

}
