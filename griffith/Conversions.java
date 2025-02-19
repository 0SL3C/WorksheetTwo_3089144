package griffith;

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
        int number = Integer.parseInt(val);
        return number;
    }

    public String integerToString (int val){
        return null;
    }

    public String switchCase(){
        return null;
    }
}
