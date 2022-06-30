
package series;

import java.util.Scanner;

public class TemperatureConvert {
    
    public static void main(String[] args) {
        
        double F;
        double C;
        double K;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit: " );
        F = input.nextDouble();
        C = 5*(F-32)/9;
        System.out.printf("Get Celsius = %.3f\n", C);
        
        K = 273.15 + 5*(F-32)/9;
        System.out.printf("Get Kelvin = %.3f", K);
        
    }
}
