
package array_demo;

import java.util.ArrayList;

public class ArrayListEqualAddAll {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(15);
        number1.add(20);
        number1.add(25);
        System.out.println("Number 1 = "+ number1);
        
        number2.add(30);
        number2.add(35);
        number2.add(40);
        number2.add(45);
        System.out.println("Number 2 = "+ number2);
        
        number3.addAll(number1);
        System.out.println("Number 3 = "+ number3);
        
        boolean equal = number3.equals(number1);
        System.out.println("If it is equal:" + equal);
     }
    
}
