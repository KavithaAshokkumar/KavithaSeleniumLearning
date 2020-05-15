package week2.day2.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom1 {

	public static void main(String[] args) {
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
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		
		
	}

}
