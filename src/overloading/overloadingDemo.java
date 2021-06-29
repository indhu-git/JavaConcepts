package overloading;

public class overloadingDemo {

	
	public void add1() {
		System.out.println("add");
	}
	
	public static void add(Integer number) {
		System.out.println("add");
	}
	public int add(Integer number, Integer number2) {
		System.out.println("add");
		return number2;
	}
	
}
