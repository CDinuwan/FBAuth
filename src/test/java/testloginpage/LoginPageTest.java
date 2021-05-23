package testloginpage;

import HomePage.FBHome;
import base.BaseTest;
import loginpage.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        loginpage.setUsernameField("0767115744");
        loginpage.setPasswordField("C@Dinuwan97");
    }
}
