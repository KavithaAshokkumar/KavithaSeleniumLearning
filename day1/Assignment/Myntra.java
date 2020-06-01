package week4.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1) Open https://www.myntra.com/
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		    System.setProperty("webdriver.chrome.silentOutput", "true");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications-");
				
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("https://www.myntra.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
		
		  //2) Mouse over on WOMEN
		  
		  WebElement women =
		  driver.findElementByXPath("(//a[@class='desktop-main'])[2]");
		  
		  Actions builder = new Actions(driver);
		  
		  builder.moveToElement(women).perform();
		  
		  Thread.sleep(3000);
		  
		  
		  //3) Click Jackets & Coats
		  
		  driver.findElementByLinkText("Jackets & Coats").click();
		  
		  // 4) Find the total count of item
		  
		  String count = driver.findElementByClassName("title-count").getText();
		  
		  System.out.println("The total count of item is:" + count);
		  
		  
		  //5) Validate the sum of categories count matches
		  
		  Thread.sleep(3000);
		  
		  WebElement categoryJacket =
		  driver.findElementByXPath("(//span[@class='categories-num'])[1]");
		  
		  String category1Count = categoryJacket.getText();
		  
		  System.out.println("Category1 count is:" + category1Count);
		  
		  WebElement categoryCoats = driver.findElementByXPath("(//span[@class='categories-num'])[2]");
		  
		  String category2Count = categoryCoats.getText();
		  
		  System.out.println("Category2 count is:" + category2Count);
		  
		  driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		 
		 driver.findElementByClassName("brand-more").click();
		 
		 driver.findElementByXPath("//input[@placeholder='Search brand']").sendKeys("MANGO");
				
		 driver.findElementByXPath("//label[@class=' common-customCheckbox']//div[1]").click();
		 
		 driver.findElementByXPath("//ul[@class='FilterDirectory-indices']/following-sibling::span[1]").click();
		 
		 driver.findElementByClassName("sort-sortBy").click();
		 
		 driver.findElementByXPath("//label[text()='Better Discount']").click();
		 
		 Thread.sleep(3000);
		 
		 
		 WebElement amount = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]");
		 
		 
		 Thread.sleep(3000);
		 
		 
		System.out.println(amount.getText());
			  
		driver.findElementByXPath("(//span[text()='wishlist'])[1]").click();
				  
		driver.close();
		
		
	
		
		
		 
		 
		 
			 
		 
		  
		 
		
		 
		

	}

}
