package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args)

	{
		String test="I am a software tester";
		String[] word = test.split(" ");
		String rev="";

		//System.out.println(Arrays.toString(word));

		for (int i = 0; i <word.length; i++)
		{
			if (i%2 == 1)
			{
				char [] temp = word[i].toCharArray();

				for (int j = temp.length-1; j>=0; j--)
				{
					rev = rev + temp[j];
					//System.out.println(rev);
					//word[i]=rev;
				}

			}
			else
			{
				rev = rev + word[i];
			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

}
