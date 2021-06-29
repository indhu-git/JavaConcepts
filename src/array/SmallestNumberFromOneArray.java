package array;

public class SmallestNumberFromOneArray {

	public static void main(String[] args) {

		int[] a = {0, 1, 3, 5, 7, 9, 10};

		int small = a[0];

		for(int i = 1; i<a.length; i++) {
		if(a[i]<small)
			small = a[i];
		}
		System.out.println(small);
		
	}

}
