package week2.day2.Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();

		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Lead')]").click();

		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		// driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		// driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("99",Keys.ENTER);

		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();

		WebElement leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		System.out.println(leadId.getText());
		// String leadIDText = leadId.getText();
		Thread.sleep(2000);

		
		  driver.
		  findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"
		  ).click();
		  driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[4]").click(); //leadId.click();
		  
		  driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[3]").click();
		  Thread.sleep(2000);
		  driver.findElementByXPath("//input[@class=' x-form-text x-form-field '][1]").sendKeys(leadId.getText());
		  Thread.sleep(2000);
		  driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[4]").click();
		 
			// driver.close();
			 
	}

}
