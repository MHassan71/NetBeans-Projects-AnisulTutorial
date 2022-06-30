package array_demo;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0; // declre sum with setting value = 0
        double avg; // declare average variable with no value

        System.out.print("\nEnter 5 numbers: ");
        double tonumber = number.length;  // declare number of indexes

        for (int i = 0; i < tonumber; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < tonumber; i++) {
            sum = sum + number[i];

        }

        avg = sum / tonumber;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + avg);
        
        double max = number[0];
        double min = number[0];
        
        for (int i = 1; i < 5; i++) {
            if (max <number[i]) {
                max = number[i];
                }
            if(min >number[i]){
                min = number[i];
            }
            
        }
        
        System.out.println("Maximum number =" + max);
        System.out.println("Minimum number =" + min);
    }

}
