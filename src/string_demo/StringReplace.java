
package string_demo;

public class StringReplace {
    
    public static void main(String[] args) {
   
        String s1 = "This is my country";
        System.out.println("Before replace: "+s1);
        
        String s2 = s1.replace('i','j');
        System.out.println("After replace: "+s2);
    }
}
