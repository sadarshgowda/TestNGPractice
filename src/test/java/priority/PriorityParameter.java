package priority;

import org.testng.annotations.Test;

public class PriorityParameter {

    @Test(priority = 0)
    public void SignUp(){
        System.out.println("sign up");
    }


    @Test(priority = 2)
    public void Book(){
        System.out.println("Book");
    }

    @Test(priority = 1)
    public void BOok(){
        System.out.println("BOok");
    }

    @Test(priority = 4)
    public void Login(){
        System.out.println("login");
    }
}
