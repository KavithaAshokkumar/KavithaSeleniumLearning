package week1.day2.classroom.string;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";

		char[] stringToChar = test.toCharArray();


		for (int i=stringToChar.length-1;i>=0;i--) {
			System.out.print(stringToChar[i]); }

	}

}
