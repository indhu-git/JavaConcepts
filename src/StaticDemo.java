
public class StaticDemo {

	static String name ="Indhu";
		String name1 ="Indhu";
	
	public void change() {
		name ="Mathi";
		name1 = "afsdf";
	}
	public static void main(String[] args) {
	System.out.println();
		StaticDemo demo = new StaticDemo();
		
		System.out.println(name);
		System.out.println(demo.name1);
	}
	
	
}
