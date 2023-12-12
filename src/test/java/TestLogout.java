import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import pages.LoginPage;


public class TestLogout extends TestBase{

    private WebDriver driver;
    private Header header;

    @Test(dataProvider = "loginData", dataProviderClass = TestBase.class)
    public void testLogout(String username, String  password) {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isUserLoggedIn(), "Successful login!");


        Header header = new Header(getDriver());
        Header.logout(driver);
        Assert.assertTrue(header.isUserLoggedOut(), "Successful logout!");

    }

}
