
import java.util.ArrayList;
import java.util.List;

public class RemovingElementFromList {

	public static void main(String[] args) {
		
		
		//Declare an initialize List
		List<Integer> list = new ArrayList<Integer>();
		
		//Populate List
		list.add(1);
		list.add(4);
		list.add(2);
		//list.add(2);
		list.add(5);
		
		
		//Removing all elements equal to 2 using loop that goes from start to end. 
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 2) {
				list.remove(i); //removes element
				i--; //shifts counter back one to account for index shift
			}
		}
		
		//Removing all elements equal to 2 using loop that goes from end to start. 
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == 2){
				list.remove(i); // removes element
			}
		}
	}
	
	

}
