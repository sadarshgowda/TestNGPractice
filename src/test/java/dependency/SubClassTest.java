package dependency;

import org.testng.annotations.Test;


public class SubClassTest extends ParentClassTest{

    //if we run only subclass , none of the methods will run,
    // because TestNG is unable to resolve the dependency from testThree in the subclass to testOne in the parent class.
    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
    }

    @Test(dependsOnMethods = { "testOne" })
    public void testThree() {
        System.out.println("Test three method in Inherited test");
    }
}
