package griffith;

import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversionsTest {

    // Define conversion object as null in a bigger scope to be used by each test
    Conversions conv = null;
    DecimalFormat df = new DecimalFormat("#.##");

    // Initialize conv object before each test call
    @BeforeEach
    void setUp() throws Exception{
        conv = new Conversions();
    }


    // Implementation of Euro To Dollar test
    @Test
    void testEuroToDollar() {
        // TestCases
        // It is a 2d array, so it will have {$euro, $expectedResult}
        double[][] testCases = {
            {50, 52.25}, // Positive values
            {-30, -31.35}, // Negative values
            {0, 0} // zero 
        };

        // For loop to iterate over testCases
        for(int i = 0; i < testCases.length; i++){
            double euro = testCases[i][0]; // euro has index 0 on testCases array
            double expectedResult = testCases[i][1]; //  euro has index 1 on testCases array
            assertEquals(df.format(expectedResult), df.format(conv.euroToDollar(euro)));
        }
    }

    // Implementation of Dollar to Euro test
    @Test
    void testDollarToEuro() {
        // TestCases
        // It is a 2d array, so it will have {$dollar, $expectedResult}
        double[][] testCases = {
            {50, 47.85}, // Positive values
            {-30, -28.71}, // Negative values
            {0, 0}, // zero
        };

        // For loop to iterate over testCases
        for(int i = 0; i < testCases.length; i++){
            double dollar = testCases[i][0]; // dollar has index 0 on testCases array
            double expectedResult = testCases[i][1]; //  dollar has index 1 on testCases array
            assertEquals(df.format(expectedResult), df.format(conv.dollarToEuro(dollar)));
        }
    }

    // Implementation of String to Integer
    @Test
    void testStringToInteger(){
        String[] testCases = {
            "123", // Numbers
            "Hello333", // Text & numbers
            "£!$[394" // Symbols & numbers
        };

        int[] expectedResults = {
            123,
            333,
            394
        };

        for(int i = 0; i < testCases.length; i++){
            String test = testCases[i];
            int expectedResult = expectedResults[i];
            assertEquals(expectedResult, conv.stringToInteger(test));
        }
    }

    @Test
    void testIntegerToString(){
        int[] testCases = {
            999, // Normal value
            Integer.MAX_VALUE,  // Boundary values of integer data type
            Integer.MIN_VALUE
        };

        String[] expectedResults = {
            "999",
            "2147483647",
            "-2147483648"
        };

        for(int i = 0; i < testCases.length; i++){
            int test = testCases[i];
            String expectedResult = expectedResults[i];
            assertEquals(expectedResult,conv.integerToString(test));
        }
    }

    @Test
    void testSwitchCase(){
        // 2d Array, index 0 is the testCase and index 1 is expectedResult
        String[][] testCases = {
            {"Hello", "hELLO"}, // Normal values
            {null, null}, // null value
            {"", ""}, // empty string
            {"123", "123"}, // numeric
        };

    
        for(int i = 0; i < testCases.length; i++){
            String testCase = testCases[i][0];
            String expectedResult = testCases[i][1];
            assertEquals(expectedResult, conv.switchCase(testCase));
        }
    }
}