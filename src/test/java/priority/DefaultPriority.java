package priority;

import org.testng.annotations.Test;

public class DefaultPriority {

    @Test(priority = 1)
    public void SignUp(){
        System.out.println("sign up");
    }


    @Test(priority = 2)
    public void Book(){
        System.out.println("Book");
    }

    @Test(priority = 3)
    public void BOok(){
        System.out.println("BOok");
    }

    //// default priority of zero when no explicit priority is provided
    // we can give negative value to priority, as integer range from -2^31 to 2^31-1, negative has high priority
    @Test
    public void Login(){
        System.out.println("login");
    }
}
