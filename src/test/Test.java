package test;

public class Test {
	public static void main(String[] args) {
		printPermutn("abcd","");
	}

//least number
	public void leastNumber() {
		Integer[] numbers = new Integer[] { 10, 33, 4, 77, 6, 9, 18 };
		int temp = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (temp > numbers[i]) {
				temp = numbers[i];
			}
		}
		System.out.println(temp);
	}
	
	// Function to print all the permutations of str 
    static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.println(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
}
