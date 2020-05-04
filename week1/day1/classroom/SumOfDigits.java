package week1.day1.classroom;

public class SumOfDigits {
	
	public static void main(String[] args)
	{
		int input = 123;
		int sum = 0;
		int remainder;
		
		while(input>0)
		{
			remainder = input % 10;
			
			/*
			 * System.out.println("Printing the remainder to confirm");
			 * System.out.println(remainder);
			 */
			
			sum = sum + remainder;
			
			/*
			 * System.out.println("Printing the sum to confirm"); System.out.println(sum);
			 */
			input = input/10;
			
			/*
			 * System.out.println("Printing the quotient to confirm");
			 * System.out.println(input);
			 */
		}
		System.out.println("Sum of digits for the given number");
		System.out.println(sum);
	}

}
