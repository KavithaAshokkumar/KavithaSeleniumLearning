package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		String[] word = text.split(" ");
		String newtext = "";
		int count = 0;

		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count = count + 1;
					newtext = text.replace(word[i], " ");
				}
			}

		}
		System.out.println("The number of occurance of the duplicate word is: " + count);

		System.out.println(newtext);

	}

}
