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
import Steps.PopularCategories;

@RunWith(SerenityRunner.class)
public class PopularCategoriesTests {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    SignIn signIn;

    @Steps
    PopularCategories sneakers;
    @Steps
    PopularCategories koreanBeauty;
    @Steps
    PopularCategories wristWatches;
    @Steps
    PopularCategories fishing;
    @Steps
    PopularCategories collectibles;
    @Steps
    PopularCategories smartPhones;
    @Steps
    PopularCategories popularSell;

    //sneakers
    @Test
    public void sneakersTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        sneakers.verifyElementWorking(Locators.sneakers, Locators.sneakersUrl);
        TimeOut.timeout();
    }

    //koreanBeauty
    @Test
    public void koreanBeautyTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        koreanBeauty.verifyElementWorking(Locators.koreanBeauty, Locators.koreanBeautyUrl);
        TimeOut.timeout();
    }

    //wristWatches
    @Test
    public void wristWatchesTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        wristWatches.verifyElementWorking(Locators.wristWatches, Locators.wristWatchesUrl);
        TimeOut.timeout();
    }

    //fishing
    @Test
    public void fishingTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        fishing.verifyElementWorking(Locators.fishing, Locators.fishingUrl);
        TimeOut.timeout();
    }

    //collectibles
    @Test
    public void collectiblesTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        collectibles.verifyElementWorking(Locators.collectibles, Locators.collectiblesUrl);
        TimeOut.timeout();

    }

    //smartPhones
    @Test
    public void smartPhonesTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        smartPhones.verifyElementWorking(Locators.smartPhones, Locators.smartPhonesUrl);
        TimeOut.timeout();
    }

    //popularSell
    @Test
    public void popularSellTest() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        signIn.signInUsingUserNameAndPassword();
        TimeOut.timeout();
        popularSell.verifyElementWorking(Locators.popularSell, Locators.popularSellUrl);
        TimeOut.timeout();
    }
}
