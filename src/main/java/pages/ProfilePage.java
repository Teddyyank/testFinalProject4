package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    public static final String PROFILE_URL = "http://training.skillo-bg.com:4200/users/";
    private final WebDriver driver;

    @FindBy(css = "h2[_ngcontent-deh-c12]:first-child")
    private WebElement username;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public String getUsername() {
//        return username.getText();
//    }

    public void navigateTo() {
        this.driver.get(PROFILE_URL);
    }

    public boolean isUrlLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.urlContains(ProfilePage.PROFILE_URL));
    }


}
