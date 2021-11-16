package Tests;


import Utils.Locators;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.HomePage;

@RunWith(SerenityRunner.class)
public class HomePageTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    HomePage home;

    @Test
    public void homePageTest() {

        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        home.verifyTitle();
    }
}
