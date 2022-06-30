
package series;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciPractice {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to print Fibonacci series up to that number: ");
        int fibInput = input.nextInt();

        //int fibInput = 100;
        int fibFirst =0;
        int fibSecond = 1;
        int fibNext=1;

            //System.out.print(fibFirst + " " + fibSecond);
            
            int fibLimit = fibInput;//, j=0;
            ArrayList <Integer> fibSeries = new ArrayList<>();
            
            for (int i = 0; i <=fibLimit; i++) {
                fibNext = fibFirst + fibSecond;
                if (fibNext>fibLimit) {
                    break;
                }
                fibSeries.add (fibNext);
                fibFirst = fibSecond;  // fibSecond get assigned with fibFirst
                fibSecond = fibNext;   // fibSecond get assigned with
                //System.out.println(fibSeries.get(i));
            }

            String printStatement = "";
            for ( int j : fibSeries) {
                printStatement = fibSeries.toString();
            }
        System.out.println(printStatement);
            //for (int j=0;j<fibSeries.size();j++) {
              //  int currFibSeq = fibSeries.get(j);
               // String printStatement = fibSeries.toString()
            //}
    }
}

    

