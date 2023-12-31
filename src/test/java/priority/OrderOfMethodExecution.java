package priority;

import org.testng.annotations.Test;

public class OrderOfMethodExecution {

    // default priority of zero when no explicit priority is provided
    // methods will be executed based n the ASCII value of each character
    @Test
    public void SignUp(){
        System.out.println("sign up");
    }


    @Test
    public void Book(){
        System.out.println("Book");
    }

    @Test
    public void BOok(){
        System.out.println("BOok");
    }

    @Test
    public void Login(){
        System.out.println("login");
    }


}
