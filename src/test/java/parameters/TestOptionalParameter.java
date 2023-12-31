package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOptionalParameter {

    @Test
    @Parameters({"a","b"})
    public void testAddition(@Optional("10") int value1, int value2) {
        int result = value1 + value2;
        System.out.println("Addition result: " + result);
    }
}
