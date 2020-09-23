package genericMethods;

public class GenericObjectMethod {
	public static void printArray( Object ... inputArray ) {
	      for(Object element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }

	   public static void main(String args[]) {
	    
	      System.out.println("Array 1 :");
	      printArray( 1, 'L', 3, 4, 5 );

	      System.out.println("\nArray 2 :");
	      printArray(77, 2.2);

	      System.out.println("\nArray 3 :");
	      printArray('H', 50 , 'L', 0.5);
	   }
}
