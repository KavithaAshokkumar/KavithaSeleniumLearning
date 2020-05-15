package week2.day1.assignment;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebDriver.Windows;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kavitha");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ashokkumar");
		
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select sourceDropdown = new Select(Source);
		sourceDropdown.selectByVisibleText("Employee");
		
		
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select marketingCampaignDropdown = new Select(MarketingCampaign);
		marketingCampaignDropdown.selectByValue("9001");
		
        WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select ownershipDropdown = new Select(Ownership);
		ownershipDropdown.selectByIndex(4);
		
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryDropdown = new Select(Country);
		countryDropdown.selectByVisibleText("India");
		
		driver.findElementByClassName("smallSubmit").click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
//driver.close();
		
	}

}
