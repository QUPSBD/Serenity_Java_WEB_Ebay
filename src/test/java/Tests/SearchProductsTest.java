package Tests;

import Utils.Locators;
import Utils.TimeOut;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.SignIn;
import Steps.SearchItems;

@RunWith(SerenityRunner.class)
public class SearchProductsTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    SignIn signIn;

    @Steps
    SearchItems searchItems;

    @Test
    public void searchFromSearchBoxTest(){
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        searchItems.searchAItemByName();

    }
}
