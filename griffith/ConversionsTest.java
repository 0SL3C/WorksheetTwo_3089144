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

    @Test
    void testDollarToEuro() {
        // TestCases
        // It is a 2d array, so it will have {$dollar, $expectedResult}
        double[][] testCases = {
            {50, 47.85}, // Positive values
            {-30, -28.71}, // Negative values
            {0, 0} // zero 
        };

        // For loop to iterate over testCases
        for(int i = 0; i < testCases.length; i++){
            double dollar = testCases[i][0]; // dollar has index 0 on testCases array
            double expectedResult = testCases[i][1]; //  dollar has index 1 on testCases array
            assertEquals(df.format(expectedResult), df.format(conv.dollarToEuro(dollar)));
        }
    }
}
