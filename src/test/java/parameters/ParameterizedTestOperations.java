package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestOperations {

    @Parameters({"a", "b"})
    @Test
    public void testReadMultipleParameter(String value1, String value2) {
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int result = val1 + val2;
        System.out.println("Addition result: " + result);
        // Add your assertions here to check the result
    }

    @Parameters("c")
    @Test
    public void testReadSingleParameter(String value) {
        int val = Integer.parseInt(value);
        int result = val * 5;
        System.out.println("Result: " + result);
        // Add your assertions here to check the result
    }
}