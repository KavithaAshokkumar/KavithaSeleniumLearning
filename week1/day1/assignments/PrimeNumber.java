package week1.day1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		int input = 8;
		boolean flag = true;
		
		for (int i = 2; i<= input/2; i++)
		{
			if (input % i == 0)
			{
				flag = false;
				break;
				
			}
		}
			
		if (flag == true)
		{
			System.out.println("The given number is a prime number");
		}
		else
		{
			System.out.println("The given number is not a prime number");
		}
		
	}
}
