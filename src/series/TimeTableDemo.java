
package series;

import java.util.Scanner;

public class TimeTableDemo {
    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
       
        int m, n;
        
        System.out.print("Enter initial multiplier: ");
        m = input.nextInt();
        
        System.out.print("Enter final multiplier: ");
        //System.out.println();
        n = input.nextInt();
        
        for (int i = m; i <=n; i++) {
            System.out.println();
            for (int j = 1; j <= 15; j++) {
                
                //System.out.println();
                
                System.out.println(i + " x " +j + " = "+ i*j);
            }
            
             System.out.println("=============");
                        
            
        }
        
        
    }
}
