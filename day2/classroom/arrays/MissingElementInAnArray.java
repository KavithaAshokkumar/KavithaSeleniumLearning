package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int j;

		Arrays.sort(arr);

		for(int i = 0; i<=arr.length;i++)
		{

			j= i+1;
			if(j!=arr[i])
			{
				System.out.println(j);
				break;
			}
		}
	}
}
