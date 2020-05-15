package week2.day2.Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("kavithaashokumar@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		WebElement leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		//Thread.sleep(2000);
		//System.out.println(leadId.getText());
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
		
		WebElement firstLead = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String duplicateLead1 = firstLead.getText();
		System.out.println(duplicateLead1);
		
		driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[1]").click();
		WebElement name = driver.findElementById("sectionHeaderTitle_leads");
		System.out.println(name.getText());
		
		if (name.getText().contentEquals("Duplicate Lead"))
		{
			System.out.println("We have entered into Duplicate Lead Page");
		}
		else
		{
			System.out.println("Different Page");
		}
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		WebElement duplicateLead = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String duplicateLead2 = duplicateLead.getText();
		System.out.println(duplicateLead2);
		
		if (duplicateLead1.contentEquals(duplicateLead2))
		{
			System.out.println("duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("duplicated lead name is not the same captured name");
		}
		 driver.close();
		 
	}

}
