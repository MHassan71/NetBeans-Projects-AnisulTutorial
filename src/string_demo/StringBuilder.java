
package string_demo;

public class StringBuilder {
    public static void main(String[] args) {
        String R= "SHAMWIL";
        StringBuffer sb = new StringBuffer(R);
        
        System.out.println("Original SHAMWIL: " + sb);
        
        sb.reverse();
        
        System.out.println("Reverse SHAMWIL: " + sb);
    }
}
