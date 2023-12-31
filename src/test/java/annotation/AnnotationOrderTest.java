package annotation;

import org.testng.annotations.*;

public class AnnotationOrderTest {

    // Executes before the entire suite
    //This annotation marks a method that should execute before the execution of all tests in the suite
    // Typically used for setup tasks that are common to the entire suite, such as initializing resources, setting up connections, loading configurations
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }


    // Executes after the entire suite
    //Marks a method that should execute after the execution of all tests in the suite.
    // Ideal for tear down tasks or cleanup operations that need to be performed after all tests in the suite have executed,
    // such as closing connections, releasing resources, generating reports, or any other global cleanup tasks.
    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    // Executes before any test method in the suite
    //Identifies a method that should execute before any test method belonging to a specific <test> tag within a TestNG suite.

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    // Executes after all the test methods in the suite
    //Marks a method that should execute after all test methods belonging to a specific <test> tag within a TestNG suite have executed.
    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    // Executes before any test class runs in the suite
    //Marks a method that should execute before any test method within a specific test class starts executing.
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    // Executes after all the test classes in the suite
    // Identifies a method that should execute after all the test methods within a specific test class have executed.
    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    // Executes before each test method
    //Marks a method that should execute before each test method within a test class.
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    // Executes after each test method
    // Identifies a method that should execute after each individual test method in a test class.
    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    // Test method 1
    @Test
    public void testMethodOne() {
        System.out.println("Test method 1");
    }

    // Test method 2
    @Test
    public void testMethodTwo() {
        System.out.println("Test method 2");
    }
}
