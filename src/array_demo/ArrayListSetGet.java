
package array_demo;

import java.util.ArrayList;

public class ArrayListSetGet {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<> ();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);
        
        System.out.println("Before setting: " + number);
        
        number.set(3, 60); // Replace an already index value
        
        System.out.println("After setting: " + number);
        
        int x = number.get(0);
        System.out.println("Value of 0 index:" + x);
    }
    
}
