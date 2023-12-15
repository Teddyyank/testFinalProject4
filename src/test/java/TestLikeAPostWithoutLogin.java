import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestLikeAPostWithoutLogin extends TestBase {

    @Test
    public void testLikeAPostWithoutLogin() {

        HomePage homePage = new HomePage(super.getDriver());
        homePage.navigateTo();

        Assert.assertTrue(homePage.isUrlLoaded(), "Home");

        homePage.clickOnTheFirstPost();

        Assert.assertTrue(homePage.isVisibleCommentField(), "Comment here");

        homePage.clickOnLikeButton();

        homePage.isToastVisible();

        Assert.assertTrue(homePage.isToastVisible(), "You must login");
    }


}
