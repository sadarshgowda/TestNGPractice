package priority;

import org.testng.annotations.Test;

public class TestNgPriorityAsciiExample {

    @Test(priority = 'A')
    public void testMethodA() {
        System.out.println("Method A");
    }

    @Test(priority = 'B')
    public void testMethodB() {
        System.out.println("Method B");
    }

    @Test(priority = 'C')
    public void testMethodC() {
        System.out.println("Method C");
    }

}
