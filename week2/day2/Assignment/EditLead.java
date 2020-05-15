package week2.day2.Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException  {
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
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[3]").click();
		
		driver.findElementByXPath("//div[@id='findLeads']//following::form[@method='POST']//following::input[@name='firstName']").sendKeys("Hari",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		System.out.println(driver.getTitle());
		
		String beforeUpdate = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("The name before updating:"+ beforeUpdate);
		driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[3]").click();
		
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
		
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String afterUpdate = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("The name after updating:"+ afterUpdate);
		
		if (beforeUpdate.equals(afterUpdate))
		{
			System.out.println("The name is not updated");
		}
		else
		{
			System.out.println("Name is updated");
		}
		
		 driver.close();
		
		
	}

}
