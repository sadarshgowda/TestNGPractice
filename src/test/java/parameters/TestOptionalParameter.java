package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Optional is used in TestNG to mark a test method parameter as optional.
// It allows the test method to execute even if the parameter is not specified in the TestNG XML suite configuration
public class TestOptionalParameter {

    @Test
    @Parameters({"a","b"})
    public void testOptionalParameter(@Optional("10") int value1, @Optional("20") int value2) {
        int result = value1 + value2;
        System.out.println("Addition result: " + result);
    }

    //value defined in the xml for this parameter will override the default value defined inside optional
    @Test
    @Parameters({"c"})
    public void testOptionalParameterXmlDefined(@Optional("50") int value1) {
        int result = value1;
        System.out.println("result: " + result);
    }
}
