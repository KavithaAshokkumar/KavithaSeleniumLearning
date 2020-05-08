package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";

		char[] changedString = test.toCharArray();
		//char changedChar[];

		for (int i=0; i<changedString.length;i++)

		{
			if (i%2==1)
			{
				changedString[i]=Character.toUpperCase(changedString[i]);

			}
			System.out.print(changedString[i]);

		}

	}

}
