import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Integer intArray[] = new Integer[]{1, 2, 3, 4, 4, 4, 1, 2,1,1};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<intArray.length;i++) {
			if(map.containsKey(intArray[i])) {
				map.put(intArray[i], map.get(intArray[i])+1);
			}else {
				map.put(intArray[i], 1);
			}	
		}
		System.out.println(map);
		

		Map<Character, Integer> stringMap = new HashMap<>();

		
		String s = "Indhumathi is good heart human";
		String lowerCaseString= s.toLowerCase();

		for(int i = 0; i<s.length();i++) {
			if(stringMap.containsKey(lowerCaseString.charAt(i))) {
				stringMap.put(lowerCaseString.charAt(i), stringMap.get(lowerCaseString.charAt(i))+1);
			}else {
			stringMap.put(lowerCaseString.charAt(i), 1);
			}
		}
		System.out.println(stringMap);
	}
	
	
	

}
