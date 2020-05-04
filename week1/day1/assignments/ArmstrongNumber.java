package week1.day1.assignments;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		int input = 371 ;
		int calculated = 0;
		int remainder;
		int original;
		
		original = input;
		
		while (input>0)
		{
			remainder = input % 10;
			input = input/10;
			calculated = calculated + (remainder*remainder*remainder);
		}
		
			if (calculated == original)
			{
				System.out.println("Amstrong Number");
			}
				
			else
			{
				System.out.println("Not a Amstrong Number");
			}
			
		}
		
		
	}

