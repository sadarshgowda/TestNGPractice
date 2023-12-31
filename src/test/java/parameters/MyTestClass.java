package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestClass {

    @Parameters({"a", "b"})
    @Test
    public void testAddition(int value1, int value2) {
        int result = value1 + value2;
        System.out.println("Addition result: " + result);
        // Add your assertions here to check the result
    }
}
