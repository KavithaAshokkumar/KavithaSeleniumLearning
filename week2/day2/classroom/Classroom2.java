package week2.day2.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 {

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
		
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[4]").click();
		driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']/ancestor::td)[2]").click();
		driver.findElementByXPath("(//input[@id='ComboBox_partyIdTo']/ancestor::td)[2]").click();
		
	}

}
