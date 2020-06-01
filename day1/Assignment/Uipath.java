package week4.day1.Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Uipath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    System.setProperty("webdriver.chrome.silentOutput", "true");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications-");
				
				ChromeDriver driver = new ChromeDriver(options);
				
				//Launch and login
				driver.get("https://acme-test.uipath.com/account/login");
				
				driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com");
				driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
				driver.findElementByXPath("//button[@id='buttonLogin']").click();
				
				//Mouse over on vendors
				
				  Thread.sleep(3000);
								
				  WebElement vendors = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
				 
				  Actions builder = new Actions(driver);
				  
				  builder.moveToElement(vendors).perform();
				  
				  Thread.sleep(3000);
				  
				  driver.findElementByXPath("//a[@href='/vendors/search']").click();
				  
				  driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
				  
				  driver.findElementByXPath("//button[@id='buttonSearch']").click();
				  
				  
				WebElement country =  driver.findElementByXPath("(//table[@class='table']//td)[5]");
				  
				 String countryName = country.getText();
				 
				 System.out.println("The country name based on vendor is:" + countryName);
				 
				 driver.findElementByXPath("//a[@href='/account/logout/']").click();
				 
					driver.close();
				  
				 
			
				  
				  
				  
				  
				  
				  
				
		
		
		
		
	}

}
