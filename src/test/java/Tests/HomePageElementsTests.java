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
import Steps.HomePage;

@RunWith(SerenityRunner.class)
public class HomePageElementsTests {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    SignIn signIn;
    @Steps
    HomePage home;

    //Deals
    @Test
    public void dailyDealsTest(){
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyDailyDealsButton();
        TimeOut.timeout();
    }

    //help & contact
    @Test
    public void helpAndContactTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyHelpAndContactButton();
        TimeOut.timeout();
    }

    //sell
    @Test
    public void sellTest(){
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifySellButton();
    }

    //electronics
    @Test
    public void electronicsTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyElectronicsButton();
    }

    //fashion
    @Test
    public void fashionTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyFashionButton();
    }

    //healthAndBeauty
    @Test
    public void healthAndBeautyTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyHealthAndBeautyButton();
    }

    //homeAndGarden
    @Test
    public void homeAndGardenTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyHomeAndGardenButton();
    }

    //sports
    @Test
    public void sportsTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifySportsButton();
    }

    //collectiblesAndArtPage
    @Test
    public void collectiblesAndArtPageTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyCollectiblesAndArtPageButton();
    }

    //industrialEquipmentPage
    @Test
    public void industrialEquipmentPageTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyIndustrialEquipmentPageButton();
    }

    //motorsPage
    @Test
    public void motorsPageTest () {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        home.verifyMotorsPageButton();
    }
}
