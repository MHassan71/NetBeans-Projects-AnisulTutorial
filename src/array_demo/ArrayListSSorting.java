
package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSSorting {
    
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<> ();
        
        number.add(10);
        number.add(20);
        number.add(-3);
        number.add(0);
        number.add(23);
        number.add(14);
        number.add(55);
        number.add(27);
        
        System.out.println("Before sorting: " + number);
        
        Collections.sort(number);  // Ascending order
        System.out.println("After sorting in ascending order: " + number);
        
        Collections.sort(number,Collections.reverseOrder());
        
        System.out.println("After sorting in descending order: " + number);
    }
    
}
