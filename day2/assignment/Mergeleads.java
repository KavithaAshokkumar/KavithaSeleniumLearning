package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mergeleads {
	
	public static void main(String[] args)
	
	{
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    System.setProperty("webdriver.chrome.silentOutput", "true");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications-");
				
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//http://leaftaps.com/crmsfa/control/LookupContacts?id=&parm0=LookupContacts
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		  driver.findElementById("username").sendKeys("Demosalesmanager");
		  driver.findElementById("password").sendKeys("crmsfa");
		  
		  driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		  driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		  
		  driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		  driver.findElementByXPath("//a[contains(text(),'Merge Contacts')]").click();
		  
		// String firstWindow = driver.getWindowHandle();
		  
		  driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();
		  
			
			
	  Set<String> firstAndSecond = driver.getWindowHandles();
	  
	  List<String> listHandles = new ArrayList<String>(firstAndSecond);
	  
	  String secondWindow = listHandles.get(1);
	  
	  System.out.println(driver.getTitle()); //listHandles.addAll(firstAndSecond);
	  
	  driver.switchTo().window(secondWindow);
	  
	  System.out.println(driver.getTitle());
	  
	  driver.findElementByXPath("//table[@class='x-grid3-row-table']//td//div//a[1]").click();
	  
	  driver.switchTo().window(listHandles.get(0));
	  
	  //To click the ToLeads icon
	 
	  driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a").click();
	  
	  //To clickthe second resulting Lead
      Set<String> firstAndThird = driver.getWindowHandles();
	  
	  List<String> secondListHandles = new ArrayList<String>(firstAndThird);
	  
	  String thirdWindow = secondListHandles.get(1);
	  
	  System.out.println(driver.getTitle()); //listHandles.addAll(firstAndSecond);
	  
	  driver.switchTo().window(thirdWindow);
	  
	  System.out.println(driver.getTitle());
	  
	  driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[2]//td//a").click();
	  
	  driver.switchTo().window(secondListHandles.get(0));
	  
	  driver.findElementByXPath("//a[@class='buttonDangerous']").click();
	  
	  TargetLocator switchTo = driver.switchTo();
		
	 Alert alert = switchTo.alert();
		
     alert.accept();
     
     System.out.println(driver.getTitle());
     
     
     
     
		
		
		  
	
				
				
				
				
				
	}
	

}
