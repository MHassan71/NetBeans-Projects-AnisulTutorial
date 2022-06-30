
package series;

import java.util.Scanner;

public class PrimeNumberDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any positive number: ");
        int num, count=0;
        
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            
            if(num%i==0){
                count ++;
                break;
                
            }
            
            
        }
        if(count==0){
                System.out.println("It is a Prime Number");
            }
            else{
                System.out.println("It is not a Prime Number");
            }
    }
    
}
