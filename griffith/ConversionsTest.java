// Name / Student Number
// Celso Vinicius Franco Ferreira
// 3089144

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversionsTest {

    // Define conversion object as null in a bigger scope to be used by each test
    Conversions conv = null;
    // Define a DecimalFormat object to format the output
    DecimalFormat df = new DecimalFormat("#.##");

    // Initialize conv object before each test call
    @BeforeEach
    void setUp() throws Exception {
        conv = new Conversions();
    }

    // Test method for euroToDollar conversion
    @Test
    void testEuroToDollar() {
        // TestCases
        // It is a 2d array, so it will have {euro, expectedResult}
        double[][] testCases = {
            {50, 52.25}, // Positive values
            {-30, -31.35}, // Negative values
            {0, 0} // Zero value
        };

        // For loop to iterate over testCases
        for (int i = 0; i < testCases.length; i++) {
            double euro = testCases[i][0]; // euro has index 0 on testCases array
            double expectedResult = testCases[i][1]; // expectedResult has index 1 on testCases array
            // Assert that the conversion result matches the expected result
            assertEquals(df.format(expectedResult), df.format(conv.euroToDollar(euro)));
        }
    }

    // Test method for dollarToEuro conversion
    @Test
    void testDollarToEuro() {
        // TestCases
        // It is a 2d array, so it will have {dollar, expectedResult}
        double[][] testCases = {
            {50, 47.85}, // Positive values
            {-30, -28.71}, // Negative values
            {0, 0}, // Zero value
        };

        // For loop to iterate over testCases
        for (int i = 0; i < testCases.length; i++) {
            double dollar = testCases[i][0]; // dollar has index 0 on testCases array
            double expectedResult = testCases[i][1]; // expectedResult has index 1 on testCases array
            // Assert that the conversion result matches the expected result
            assertEquals(df.format(expectedResult), df.format(conv.dollarToEuro(dollar)));
        }
    }

    // Test method for stringToInteger conversion
    @Test
    void testStringToInteger() {
        // TestCases
        String[] testCases = {
            "123", // Numbers
            "Hello333", // Text & numbers
            "£!$[394" // Symbols & numbers
        };

        // Expected results corresponding to the testCases
        int[] expectedResults = {
            123,
            333,
            394
        };

        // For loop to iterate over testCases
        for (int i = 0; i < testCases.length; i++) {
            String test = testCases[i];
            int expectedResult = expectedResults[i];
            // Assert that the conversion result matches the expected result
            assertEquals(expectedResult, conv.stringToInteger(test));
        }
    }

    // Test method for integerToString conversion
    @Test
    void testIntegerToString() {
        // TestCases
        int[] testCases = {
            999, // Normal value
            Integer.MAX_VALUE,  // Boundary value of integer data type
            Integer.MIN_VALUE // Boundary value of integer data type
        };

        // Expected results corresponding to the testCases
        String[] expectedResults = {
            "999",
            "2147483647",
            "-2147483648"
        };

        // For loop to iterate over testCases
        for (int i = 0; i < testCases.length; i++) {
            int test = testCases[i];
            String expectedResult = expectedResults[i];
            // Assert that the conversion result matches the expected result
            assertEquals(expectedResult, conv.integerToString(test));
        }
    }

    // Test method for switchCase conversion
    @Test
    void testSwitchCase() {
        // TestCases
        // It is a 2d array, so it will have {inputString, expectedResult}
        String[][] testCases = {
            {"Hello", "hELLO"}, // Normal values
            {null, null}, // Null value
            {"", ""}, // Empty string
            {"123", "123"}, // Numeric string
        };

        // For loop to iterate over testCases
        for (int i = 0; i < testCases.length; i++) {
            String testCase = testCases[i][0]; // inputString has index 0 on testCases array
            String expectedResult = testCases[i][1]; // expectedResult has index 1 on testCases array
            // Assert that the conversion result matches the expected result
            assertEquals(expectedResult, conv.switchCase(testCase));
        }
    }
}