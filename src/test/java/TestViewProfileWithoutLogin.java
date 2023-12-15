import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestViewProfileWithoutLogin extends TestBase{

    @Test
    public void testViewProfileWithoutLogin() {

        HomePage homePage = new HomePage(super.getDriver());
        homePage.navigateTo();

        Assert.assertTrue(homePage.isUrlLoaded(), "Login");

        //click on the first profile name

        //assert that the toast "You must log in" is visible




    }






}
