
public class ArraysExample1D {

	public static void main(String[] args) {
		
		/*
		 * Important Points:
		 * 	- An array is an example of a STATIC DATA STRUCTURE.  This means that the size of the structure must be specified at creation and is fixed. 
		 *	- An array is a REFERENCE variable.  This means that if an array is passed to a method any changes to the argument remain when method is done. 
		 *	- An array must hold data of the same type. 
		 *	- An array can be initialized with values using set brackets.	
		 */
		
		
		//Create an array of a specific size, initializing all values to default
		int[] intArray1 = new int[10]; //creates an array of 10 integers.  All values are initialized to 0. Length = 10, indexes 0 - 9
		double[] doubleArray1 = new double[15]; //creates an array of 15 doubles. All values are initialized to 0. Length = 15, indexes 0 - 14
		String[] stringArray1 = new String[3]; //creates an array of 3 strings.  All values are initialized to null.  Length = 3, indexes 0 - 2
		boolean[] booleanArray1 = new boolean[7]; //creates an array of 7 booleans.  All values are initialized to false.  Length = 7, indexes 0 - 7
		
		
		//Create an array of a specific size, initializing values to specific value. 
		int[] intArray2 = {3,4,6,5,4,3}; //creates an array of integers.  Lenght = 6, indexes 0 - 5
		double[] doubleArray2 = {1.2,3.4,1.1}; //creates an array of doubles. Length = 3, indexes 0 - 2 
		String[] stringArray2 = {"cat","fish"}; //creates an array of Strings. Length = 2, indexes 0 - 1
		boolean[] booleanArray2 = {true,true,false,true}; //creates an array of booleans. Length = 4, indexes 0 - 3
		
		
		//Initialize Array or examples:
		int[] array = {1,4,6,5,7,8,9,5};
		
		//Access Element:
		//To access an element you need to indicate structure name and index location
		int value = array[3];  //Accesses element 4 located in 3rd index. 
		array[2] = 99; //Sets elemement 3, located in 2nd index, to 99.
		array[0] = array[array.length - 1]; //Sets first element to last element value.  Notice that Java calculates the length. 
		
		
		//Find length of array
		int l = array.length;
				
		//Loop through an array from start to end. 
		for (int i = 0; i < array.length; i = i + 1) {
			System.out.println(array[i]);
		}
		
		//Loop through an array from end to start.
		for (int i = array.length - 1; i >= 0; i = i - 1) {
			System.out.println(array[i]);
		}
		
		//Loop through an array from start to end using for each loop
		/*
		 * A for each loop was introduces in Java 7.  It is a short hand for quickly looping through an array or List. 
		 * for (<type> <name in loop>: <name of structure>){
		 * 		code
		 * }
		 * 
		 * A for each loop allows the programmer to avoid the index notation as using the structure indicates that the loop
		 * will go from start to end in sequence.  This shows up regularly in the AP examination. 
		 */
		for (int element: array) {
			System.out.println(element);
		}
		
	}

}
