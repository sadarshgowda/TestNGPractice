package grouping;

import org.testng.annotations.Test;

@Test(groups = {"all"})  //all methods irrespective of groups will run , this is called meta groups
public class TestGroupingExample {


    @Test(groups = "sanity")
    public void sanityTest1() {
        System.out.println("Sanity Test 1");
    }

    //if regression group is excluded in the xml file, so regression sanity group which is part of regression group also won't run
    @Test(groups = {"sanity", "regression"})
    public void sanityTest2() {
        System.out.println("Sanity Test 2");
    }

    @Test(groups = "regression")
    public void regressionTest1() {
        System.out.println("Regression Test 1");
    }

    @Test(groups = "regression")
    public void regressionTest2() {
        System.out.println("Regression Test 2");
    }

    //if we mention both functionality and sanity group in xml file, even if it's mentioned as separate include, this method will run only once
    @Test(groups = {"functionality", "sanity"})
    public void functionalityTest1() {
        System.out.println("Functionality Test 1");
    }

    @Test(groups = {"functionality", "regression"})
    public void functionalityTest2() {
        System.out.println("Functionality Test 2");
    }

    @Test()
    public void methodWithoutGrouping() {
        System.out.println("method without group");
    }
}
