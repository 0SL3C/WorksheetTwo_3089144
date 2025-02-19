package griffith;

public class Conversions {
    double dollarRate = 1.045;
    public double euroToDollar(double euro){
        double dollar = dollarRate;
        return euro * dollar;
    }

    public double dollarToEuro(double dollar){
        // Here is used the dollarRate divided by 1 to get the price of $ in €
        double euro = 1/dollarRate;
        return euro * dollar;
    }

    public int stringToInteger (String val){
        return 0;
    }

    public String integerToString (int val){
        return null;
    }

    public String switchCase(){
        return null;
    }
}
