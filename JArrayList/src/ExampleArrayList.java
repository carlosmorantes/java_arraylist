import java.util.ArrayList;

public class ExampleArrayList {

    public static void main(String[] args) {
    	ArrayList<Integer> listNums = new ArrayList<>(3); //initialize the list with a size of 3
    	
    	// add elements to the list
    	listNums.add(5);
    	listNums.add(4);
    	
    	System.out.println("How many elems. at the moment in the list? "+ listNums.size());
    	
    	// add more elements
    	listNums.add(45);
    	listNums.add(65);
    	
    	System.out.println("How many elems. after adding more in the list? "+ listNums.size());

    	for (Integer elem : listNums)
    		System.out.println("Elem. in the list: "+elem);
    	
    	// Modify the 1st. elem if it is 5
    	if (listNums.get(0) == 5)
    	    listNums.set(0, 999);
    	
    	System.out.println("New list elem: "+listNums);
    	
    	listNums.trimToSize();
    	System.out.println("Trim list to size: "+listNums.size());

	}

}
