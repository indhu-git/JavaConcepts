package numbers;

public class PrintTriangleNumbers {
	
	public static void main(String[] args) {
		
//		for(int i = 1; i<=5; i++) {
//			for(int j =1; j<=i; j++){
//				System.out.print(j);
//			}
//			System.out.println(" ");
//			
//		}
		
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print(a +" "+b);
		for(int i =0; c<=10; i++){
		c = a+b; 
		System.out.print(c+ " ");
		a = b;
		b = c;
		
		}
	}

}
