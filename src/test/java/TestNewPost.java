import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import pages.LoginPage;
import pages.PostPage;

import java.io.File;

public class TestNewPost extends TestBase{

    public Header header;


    @Test(dataProvider = "loginData", dataProviderClass = TestBase.class)
    public void testLogout(String username, String password, File uplPic, String postCaption) {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isUserLoggedIn(), "Successful login!");

        Header header = new Header(super.getDriver());
        header.clickNewPost();

        PostPage postPage = new PostPage(super.getDriver());
        Assert.assertTrue(postPage.isUrlLoaded());

        postPage.uploadImage(uplPic);
        Assert.assertTrue(postPage.isUrlLoaded(),"Image is not visible!");

        Assert.assertEquals(postPage.getImageName(), uplPic.getName());

        postPage.addCaption(postCaption);
        postPage.clickSubmitButton();


    }



}
