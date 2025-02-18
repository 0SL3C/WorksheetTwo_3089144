package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversionsTest {

    // Define conversion object as null in a bigger scope to be used by each test
    Conversions conv = null;

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
            {50, 52.27},
        };

        // For loop to iterate over testCases
        for(int i = 0; i < testCases.length; i++){
            double euro = testCases[i][0]; // euro has index 0 on testCases array
            double expectedResult = testCases[i][1]; //  euro has index 1 on testCases array
            assertEquals(expectedResult, conv.euroToDollar(euro));
        }
    }
}
