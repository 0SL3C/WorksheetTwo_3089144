package griffith;

import java.util.Locale;

public class Conversions {
    double dollarRate = 1.045;
    public double euroToDollar(double euro){
        double dollar = dollarRate;
        return euro * dollar;
    }

    public double dollarToEuro(double dollar){
        // Here is used 1/dollarRate to get the price of dollar in euro. €1 = $1.045 so $1 = €1/$1.045
        double euro = 1/dollarRate;
        return euro * dollar;
    }

    public int stringToInteger (String val){
        // Use regex formatting to delete all characters before conversion
        String replace = val.replaceAll("[^0-9]",""); 

        int number = Integer.parseInt(replace);
        return number;
    }

    public String integerToString (int val){
        String str = String.valueOf(val);
        return str;
    }

    public String switchCase(String val){
        String replace = val.replaceAll("[A-Z]","[a-z]").replaceAll("[a-z]","[A-Z]");
        return replace;
    }
}
