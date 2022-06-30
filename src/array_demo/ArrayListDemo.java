
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer> ();
        
        // System.out.println("Size = " + number.size());
        
        number.add(10);
        number.add(20);
        number.add(30);
        
        number.add(3, 40);
        
        /* for (int x : number){  // using for each loop
            
            System.out.print(x + " ");
        }*/
        
        /*Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }*/
        
        
        //System.out.println(number); // normal ways to print numbers
        
        System.out.println();
        //System.out.println("Size = " + number.size());
        
        boolean check = number.contains(30);
        
        System.out.println("Check the contain: " + check);
        
        int index = number.indexOf(40);
        System.out.println("Index of 40: " + index);

    }
    
}
