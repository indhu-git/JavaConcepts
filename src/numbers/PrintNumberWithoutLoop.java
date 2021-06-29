package numbers;

public class PrintNumberWithoutLoop {
	static void printNos(int n) 
    { 
		System.out.println(n);
        if(n > 0) 
        { 
        	System.out.println(n);
        	printNos(n - 1); 
        	System.out.println("");
            System.out.println(n + " ");
            
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        printNos(10); 
    } 

}
