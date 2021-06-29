package string;

public class StringReverseDemo {
	
	public static void main(String[] args) {
		
		String name = "Indhumathi";
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.reverse();
		System.out.println(builder);
		
		char[] chr = name.toCharArray();
		for(int i = chr.length-1; i>=0; i--) {
			System.out.print(chr[i]);
		}
	}

}
