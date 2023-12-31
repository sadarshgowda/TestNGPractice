package testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void testSoftAssertions() {

        SoftAssert softAssertion = new SoftAssert();
        int actualResult1 = 5;
        int expectedResult1 = 4;
        softAssertion.assertEquals(5,4);

        String actualResult2 = "Hello";
        String expectedResult2 = "World";
        softAssertion.assertEquals(actualResult2,expectedResult2);

        // More assertions can be added here

        // After adding all assertions, use assertAll() to verify them collectively.
        softAssertion.assertAll();

        //We call softAssert.assertAll() at the end to verify all the assertions.
        // If any assertions have failed, assertAll() will throw an exception, and the test will be marked as failed.
    }

}
