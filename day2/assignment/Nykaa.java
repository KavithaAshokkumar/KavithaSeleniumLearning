package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		    System.setProperty("webdriver.chrome.silentOutput", "true");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications-");
				
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("https://www.nykaa.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				WebElement brands = driver.findElementByXPath("//a[contains(text(),'brands')]");
				
				Actions builder = new Actions(driver);
				
				builder.moveToElement(brands).perform();
				
				Thread.sleep(3000);
				
				driver.findElementByXPath("//a[contains(text(),'Popular')]").click();
												
				driver.findElementByXPath("//li[@class='brand-logo menu-links'][5]/a").click();
				
				 Set<String> firstAndSecond = driver.getWindowHandles();
				  
				  List<String> listHandles = new ArrayList<String>(firstAndSecond);
				  
				  String firstWindow = listHandles.get(0);
				  
				  String secondWindow = listHandles.get(1);
				  
				 // System.out.println(driver.getTitle()); //listHandles.addAll(firstAndSecond);
				  
				  driver.switchTo().window(secondWindow);
				  
				 String name = driver.getTitle();
				 System.out.println(name);
				
				 if(name.contains("L'Oreal Paris"))
				 {
					 System.out.println("The page title contains L'Oreal Paris ");
				 }
				 else
				 {
					 System.out.println("The page title does not contain L'Oreal Paris ");
				 }
				 
				 
				  driver.switchTo().window(firstWindow).close();
				  
				// String thirdWindow = driver.getWindowHandle();
				 
				  driver.switchTo().window(secondWindow);
				  
				  //System.out.println("Hello");
					 
					Thread.sleep(3000);
					
					String name1 = driver.getTitle();
				
				   // System.out.println(name1);

					driver.findElementByXPath("//span[@title='POPULARITY']").click();
					
					driver.findElementByXPath("//span[text()='customer top rated']").click();
					
					Thread.sleep(3000);
					
					driver.findElementByXPath("//div[text()='Category']").click();
					
					driver.findElementByXPath("//span[text()='Shampoo (16)']/following-sibling::div").click();
					
					driver.findElementByXPath("	(//img[@class='listing-img'])[1]").click();
					
					//Tothe first product window
					
					Set<String> firstAndthird = driver.getWindowHandles();
					  
					  List<String> SecondListHandles = new ArrayList<String>(firstAndthird);
					  
					 // String firstWindow = listHandles.get(0);
					  
					  String thirdWindow = SecondListHandles.get(1);
					  
					 // System.out.println(driver.getTitle()); //listHandles.addAll(firstAndSecond);
					  
					  driver.switchTo().window(thirdWindow);
					  
					 String pageName = driver.getTitle();
					// System.out.println(pageName);
					 
					 driver.findElementByXPath(" (//button[text()='ADD TO BAG'])[1]").click();
					 
						Thread.sleep(3000);
						
						 driver.findElementByXPath("//div[@class='AddToBagbox']//div[1]").click();
						 Thread.sleep(3000);
						 
						 driver.findElementByXPath("//span[text()='Proceed']").click();
						 
						 String error = driver.findElementByClassName("popup-error").getText();
						 
						 System.out.println(error);
						 
						 driver.close();
						 
						 
				

	}

}
