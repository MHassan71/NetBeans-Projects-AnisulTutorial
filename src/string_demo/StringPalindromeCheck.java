
package string_demo;

public class StringPalindromeCheck {
    
    public static void main(String[] args) {
        
        String s1 = "madan";
        
        StringBuffer sb = new StringBuffer(s1);
        
        // System.out.println("Before reverse: " + sb);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not palindrome");
        // System.out.println("After reverse: " + sb);
        
        
    }
}
