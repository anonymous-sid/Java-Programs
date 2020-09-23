package genericMethods;

public class SwapGenericMethod {

	public static < E >void swap(E input1, E input2 ) {
	      E t = input1;
	      input1 = input2;
	      input2 = t;
	      System.out.println("\nInput1: " + input1 + "             Input2: " + input2);
	   }

	   public static void main(String args[]) {
	    
		  Integer intInput1 = new Integer(2);
		  Integer intInput2 = new Integer(3);
		   
		  Double doubleInput1 = new Double(99.0);
		  Double doubleInput2 = new Double(66.0);
		  
		  Character characterInput1 = new Character('A');
		  Character characterInput2 = new Character('E');

		  System.out.println("\nInt Swap:");
		  System.out.println("\nInput1: " + intInput1 + "          Input2: " + intInput2);
	      swap(intInput1,intInput2);
	      
	      System.out.println("\nDouble Swap:");
	      System.out.println("\nInput1: " + doubleInput1 + "       Input2: " + doubleInput2);
	      swap(doubleInput1,doubleInput2);
	     
	      System.out.println("\nCharacter Swap:");
	      System.out.println("\nInput1: " + characterInput1 + "    Input2: " + characterInput2);
	      swap(characterInput1,characterInput2);
	     
	   }
}
