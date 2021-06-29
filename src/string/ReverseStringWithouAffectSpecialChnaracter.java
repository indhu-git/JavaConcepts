package string;

public class ReverseStringWithouAffectSpecialChnaracter {

	public static void main(String[] args) {

		String s = "!ndhum@th!";

		char[] charArray = s.toCharArray();

		int startingLength = 0, endingLength = charArray.length - 1;

		while (startingLength < endingLength) {

			if (!Character.isAlphabetic(charArray[startingLength])) {
				startingLength++;
			} else if (!Character.isAlphabetic(charArray[endingLength])) {
				endingLength--;

			} else {

				char tmp = charArray[startingLength];
				charArray[startingLength] = charArray[endingLength];
				charArray[endingLength] = tmp;
				startingLength++;
				endingLength--;
			}
		}
		System.out.println(charArray);

	}

}
