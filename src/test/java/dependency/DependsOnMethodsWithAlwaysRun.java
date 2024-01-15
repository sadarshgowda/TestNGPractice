package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

// The alwaysRun attribute in TestNG is used to ensure that a dependent method runs even if the method it depends on fails.
public class DependsOnMethodsWithAlwaysRun {

    @Test
    public void loginTest() {
        // Simulate a successful login
        System.out.println("Login successful!");
        Assert.assertTrue(true); // Assertion to mark the test as successful
    }

    //Priorities are ignored if the those methods depends on any methods or group
    //method will run only after the successful execution of dependent method
    @Test(dependsOnMethods = "loginTest" , priority = 0)
    public void addItemsToBasket() {
        // Simulate navigating to the home page to add items to cart
        System.out.println("items are added to basket...");
        Assert.assertTrue(true); // Assertion to mark the test as successful
    }

    //this method will skip if particular depends on methods fails
    @Test(dependsOnMethods = "addItemsToBasket", priority = 2)
    public void checkBasketDetails() {
        // Simulate performing to check basket details
        System.out.println("check basket details...");
        // Additional test logic for logout
        Assert.assertTrue(false); // Assertion to mark the test as successful
    }


    //this method will skip if any of the particular depends on methods fails
    @Test(dependsOnMethods = { "addItemsToBasket", "checkBasketDetails"}, priority = 1, alwaysRun = true)
    public void createPotentialOrder() {
        // Simulate performing to create po
        System.out.println("create po...");
        // Additional test logic for logout
        Assert.assertTrue(true); // Assertion to mark the test as successful
    }


    @Test
    public void methodWithoutDependency(){
        // Simulate performing to create po
        System.out.println("not dependent on any method...");
    }
}
