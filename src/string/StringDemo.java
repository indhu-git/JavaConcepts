package string;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("MikeJackson".replaceAll("([A-Z])", " $1"));
		System.out.println("AppleOrange".replaceAll("(?!^)([A-Z])", " $1"));

	}
}
