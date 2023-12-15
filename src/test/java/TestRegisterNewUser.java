import org.testng.annotations.Test;

public class TestRegisterNewUser extends TestBase {

    @Test
    public void testRegisterNewUser() {

        //navigate to LoginPage
        //click on "Register" button
        //validate the URL "http://training.skillo-bg.com:4200/users/register"
        //enter "Username" - generate random string
        //enter "email" - generate random string +@gmail.com
        //enter "Password" - .sendkeys("test123")
        //enter "Confirm Password" - .sendkeys("test123")
        //click on "Sign in" button
        //verify toast - "User registered"
        //click on "Like" button
        // verify toast - "Post licked"

    }

    @Test
    public void testRegisterWithExistingEmail() {

        //navigate to LoginPage
        //click on "Register" button
        //validate the URL "http://training.skillo-bg.com:4200/users/register"
        //enter "Username" - generate random string
        //enter "email" - .sendkeys("Teddy123")
        //enter "Password" - .sendkeys("test123")
        //enter "Confirm Password" - .sendkeys("test123")
        //click on "Sign in" button
        //verify toast - "User registered"
    }


    @Test
    public void testNavBarToggleIcon() {

        //navigate to Home page
        //don't maximise the window
        //verify navbar-toggler-icon
        //click on it verify there is Home and Login buttons


    }



}
