package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUniqueTrain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();

		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();

		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS", Keys.TAB);

		driver.findElementByXPath("//input[@id='txtStationTo']").clear();

		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("TYT", Keys.ENTER);

		Thread.sleep(2000);
		
  List <WebElement> train = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		  
		  List <String> trainName = new ArrayList<String>();
		  
		  int size1=train.size();
		  int size2 = trainName.size();
		  
		  for (int i=1;i<size1;i++)
			  
		  { 
			  
			WebElement name = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a");
			String trainNameList = name.getText();
			
			trainName.add(trainNameList);
			 
		  }
		 
		  Collections.sort(trainName);
		  
		  for ( String train1:trainName)
			System.out.println(train1);
		 		 
		  		  
		  System.out.println(size2+" Is the total number of train");
		 	
		  Set<String> uniqueTrain = new HashSet<String>();
		  uniqueTrain.addAll(trainName);
		  if(size1!=size2)
		  {
			  System.out.println(size1-size2+" train names are duplicated");
		  }
		  else
			  System.out.println("Both train list is same");
		  Set<String> duplicateTrain = new HashSet<String>();
		  for (String duplicate : trainName )
		  {
			if (!duplicateTrain.add(duplicate))
			{
				System.out.println(duplicate);
			}
			else
	
			{
				System.out.println("Train name is unique");
			}
		  }
		  
	}
		
	}




