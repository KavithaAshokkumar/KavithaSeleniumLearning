package week1.day2.classroom.string;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";
		int occurences = 0;

		char[] stringToChar = str.toCharArray();

		//		System.out.println(stringToChar.length);


		for (int i = 0;i<stringToChar.length;i++)
		{
			if(stringToChar[i] == 'e' )

			{
				occurences = occurences+1;
			}

		}

		System.out.println(occurences);

	}


}
