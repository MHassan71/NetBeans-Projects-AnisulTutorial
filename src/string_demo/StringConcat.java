
package string_demo;

public class StringConcat {
    
    public static void main(String[] args) {
        
        String firstName = "Suwaid";
        String lastName = " Hassan";
        
        String fullName = firstName.concat(lastName);
        System.out.println("Full name is: " + fullName);
        
        String upperCase = fullName.toUpperCase();
        System.out.println("All upper case of full name: " + upperCase);
        
        String lowerCase = fullName.toLowerCase();
        System.out.println("All lower case of full name: " + lowerCase);
        
    }
    
}
