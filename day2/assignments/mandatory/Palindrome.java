package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Madam";

		String rev = "";
		char[] arr = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {
			char temp = arr[i];
			rev = rev + temp;

		}
		// System.out.print(rev);

		if (str.equalsIgnoreCase(rev))

		{
			System.out.println("The given string is a Palindrome");
		}

		else

		{
			System.out.println("The given string is not a Palindrome");

		}

	}

}
