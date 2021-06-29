package recursion;

public class RecursionClass {
//	public static void main(String[] args) {
//		RecursionClass r = new RecursionClass();
//		
//		r.printFibanaci(12);
//	  }
//	  public static int sum(int k) {
//	    if (k > 0) {
//	      return k + sum(k - 1);
//	    } else {
//	      return 0;
//	    }
//	  }
//	  int a = 0;
//	  int b = 1;
//	  public void printFibanaci(int number) {
//		  if(number>0) {
//		  int c= a+b;
//		  System.out.println(c);
//		  a = b;
//		  b = c;
//		  printFibanaci(number-1);
//		  }
//	  }
	
	public static void main(String[] args) {
		
		print(10);
	}
	
	public static void print(int count) {
		if(count>0) {
			print(count-1);
			System.out.print(count);
		}
		
	}

}
