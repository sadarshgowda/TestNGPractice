package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependsOnGroups {

    @Test(groups = {"groupA"})
    public void testMethodA1() {
        Assert.assertTrue(true);
        System.out.println("group A method");
    }

    //this methods depends on group A execution, all methods in dependent group needs to pass
    @Test(dependsOnGroups = "groupA")
    public void testMethodA2() {
        System.out.println("group B method");
    }
}
