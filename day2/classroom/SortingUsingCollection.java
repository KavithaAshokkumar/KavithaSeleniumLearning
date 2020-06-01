package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> input  = new ArrayList<String>();
        
input.add("HCL");
input.add("Wipro");
input.add("Aspire Systems");
input.add("CTS");

      int length = input.size();
      Collections.sort(input);
      
      for (int i=length-1;i>=0;i--)
      {
    	 System.out.println(input.get(i)); 
      }
      
	}

}
