package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
	

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();

		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();

		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS", Keys.TAB);

		driver.findElementByXPath("//input[@id='txtStationTo']").clear();

		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("TYT", Keys.ENTER);

		Thread.sleep(2000);
		
		
		  
		  List <WebElement> train = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		  
		  List <String> trainName = new ArrayList<String>();
		  
		  
		  for (int i=1;i<train.size();i++)
			  
		  { 
			  
			WebElement name = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a");
			String trainNameList = name.getText();
			
			trainName.add(trainNameList);
			 
		  }
		 
		  Collections.sort(trainName);
		  
		  for (String train1:trainName)
				System.out.println(train1);
		 		 
	}



}

