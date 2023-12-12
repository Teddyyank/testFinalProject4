import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLogin extends TestBase{

 @Test(dataProvider = "loginData", dataProviderClass = TestBase.class)
 public void testLogout(String username, String  password) {

  LoginPage loginPage = new LoginPage(getDriver());
  loginPage.login(username, password);
  Assert.assertTrue(loginPage.isUserLoggedIn(), "Successful login!");
 }


}
