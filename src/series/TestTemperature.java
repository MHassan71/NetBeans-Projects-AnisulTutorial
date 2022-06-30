
package series;

import java.util.Scanner;

public class TestTemperature {
    
    public static void main(String[] args) {
        
 Scanner input = new Scanner (System.in);
System.out.print("Please enter the temperature to convert to other units:");
String tempValue = input.next();
double tempValueFormatted = Double.parseDouble(tempValue);
System.out.print("Please enter the unit of the temperature:");
String tempUnit = input.next();

/*String tempValue = "120";
String tempUnit = "f";
double tempValueFormatted = Double.parseDouble(tempValue);*/

TemperatureConverter tempMain = new TemperatureConverter();
tempMain.setTemperatureValue(tempValueFormatted);
tempMain.setTemperatureUnit(tempUnit);
tempMain.convertTemperatureToOtherUnits();
    }
}
