package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {

public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		
		int len=arr.length;
		
//		System.out.println(len);
		
		for (int i = 0; i <= len-1; i++)
		{
			count =0;
		
			for (int j = i+1 ;j<= len-1; j++)
			{
				if (arr[i] == arr[j])
						{
					count=count+1;
						}
			}
				
		if (count>0)
		{
			System.out.println(arr[i]);
		}
		
		
		}

}

}
