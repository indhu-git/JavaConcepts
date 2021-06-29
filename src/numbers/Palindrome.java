package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

//		//First Method
		int num = 121;
//		int sum =0, r;
//		
//		int temp = num;
//		while(num>0) {
//			r = num%10;
//			sum=(sum*10)+r;   
//			num = num/10;
//		}
//		System.out.println(sum);
//		
//		//Second method
//		Scanner scanner = new Scanner(System.in);
//		String string = scanner.nextLine();
//		
//		String reverse = "";
//		for(int i = string.length()-1; i>=0; i--) {
//		reverse = reverse +string.charAt(i);
//		System.out.println(reverse);
//		}
		
		StringBuffer s = new StringBuffer(""+num);
		System.out.println(s.reverse());
		System.out.println(num);
		System.out.println(s.reverse().equals(num));
		if(s.reverse().equals(num)){
			System.out.println("palindrome");
		}else {
			System.out.println("no palindrome");
		}
		String q = "";
		for(int i = s.length()-1; i>=0;i--) {
			q = q+""+s.charAt(i);
			System.out.println(q);
		}
	}

}
