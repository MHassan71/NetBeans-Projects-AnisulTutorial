
package series;

public class TemperatureConverter {
   
    private String tempUnit;
    private double tempValue;

    public void setTemperatureValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public void setTemperatureUnit(String tempUnit) {
        this.tempUnit = tempUnit.toUpperCase();
    }

    /*
    public static void get_temperature_from_user (){

    }*/
    double temp1, temp2;
    String unit1, unit2;

    public void convertTemperatureToOtherUnits() {
        switch (tempUnit.toLowerCase()) {
            case "f":
            case "fahrenheit": {
                tempUnit = tempUnit.toUpperCase();
                temp1 = Math.round(((tempValue - 32) * 0.5556) * 10.0) / 10.0; //temp1 = tempFarh2Cel
                unit1 = "Celsius (C)";
                temp2 = Math.round(((tempValue + 459.67) * 0.5556) * 100.0) / 100.0; //temp2 = tempFarh2Kel
                unit2 = "Kelvin (K)";
                break;
            }
            case "c":
            case "celsius": {
                temp1 = Math.round(((tempValue * 1.8) + 32) * 10.0) / 10.0;//temp1 = tempCel2Farh
                unit1 = "Fahrenheit (F)";
                temp2 = Math.round((tempValue + 273.15) * 100.0) / 100.0;//temp2 = tempCel2Kel
                unit2 = "Kelvin (K)";
                break;
            }
            case "k":
            case "kelvin": {
                temp1 = Math.round((tempValue - 273.15) * 10.0) / 10.0;//temp1 = tempKel2Cel
                unit1 = "Celsius (C)";
                temp2 = Math.round(((tempValue - 459.67) * 0.5556) * 10.0) / 10.0;//temp2 = tempKel2Farh
                unit2 = "Fahrenheit (F)";
                break;
            }
        }
        String printMessage = tempValue + " degrees " + tempUnit + " is equal to " + temp1 + " degrees " + unit1 + " or " + temp2 + " degress " + unit2 + ".";
        System.out.println(printMessage);
    }
    }


