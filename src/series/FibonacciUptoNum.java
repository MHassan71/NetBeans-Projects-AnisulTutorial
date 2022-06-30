
package series;

import java.util.Scanner;

public class FibonacciUptoNum {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int firstNum = 0;
       int secondNum = 1;
       int fibo =0;
       
       System.out.print("Please enter number until which you want all numbers of Fibo series: ");
       int n = input.nextInt();
       
       while(fibo<=n){
           fibo = firstNum + secondNum;
           if(fibo>=n)
               break;
           
           System.out.print(fibo + " ");
           
           firstNum = secondNum;
           secondNum = fibo;
       }
       
        
     }
        
}
   

