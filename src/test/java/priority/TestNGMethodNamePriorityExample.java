package priority;

import org.testng.annotations.Test;

//TestNG, by default, executes methods in alphabetic order according to their name
public class TestNGMethodNamePriorityExample {

    @Test
    public void testMethodC() {
        System.out.println("Method C");
    }

    @Test
    public void testMethodB() {
        System.out.println("Method B");
    }

    @Test
    public void testMethodA() {
        System.out.println("Method A");
    }
}
