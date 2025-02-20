// Name / Student Number
// Celso Vinicius Franco Ferreira
// 3089144


package griffith;

public class Conversions {
    // Conversion rate from Euro to Dollar
    double dollarRate = 1.045;

    // Method to convert Euro to Dollar
    public double euroToDollar(double euro) {
        double dollar = dollarRate;
        // Return the converted amount
        return euro * dollar;
    }

    // Method to convert Dollar to Euro
    public double dollarToEuro(double dollar) {
        // Here is used 1/dollarRate to get the price of dollar in euro. €1 = $1.045 so $1 = €1/$1.045
        double euro = 1 / dollarRate;
        // Return the converted amount
        return euro * dollar;
    }

    // Method to convert a string to an integer
    public int stringToInteger(String val) {
        // Use regex formatting to delete all characters before conversion
        String replace = val.replaceAll("[^0-9]", "");

        // Parse the cleaned string to an integer
        int number = Integer.parseInt(replace);
        // Return the integer value
        return number;
    }

    // Method to convert an integer to a string
    public String integerToString(int val) {
        // Convert the integer to a string
        String str = String.valueOf(val);
        // Return the string representation
        return str;
    }

    // Method to switch the case of each character in a string
    public String switchCase(String val) {
        // Check for null input
        if (val == null) {
            return null;
        }
        // Convert the input string to a character array
        char[] letters = val.toCharArray();
        // Initialize a result array with the same length
        char[] result = new char[letters.length];

        // Iterate over each character in the input array
        for (int i = 0; i < letters.length; i++) {
            // Check if the character is uppercase
            if (Character.isUpperCase(letters[i])) {
                // Convert to lowercase and store in the result array
                result[i] = Character.toLowerCase(letters[i]);
            } else {
                // Convert to uppercase and store in the result array
                result[i] = Character.toUpperCase(letters[i]);
            }
        }
        // Convert the result array back to a string and return it
        return new String(result);
    }
}
