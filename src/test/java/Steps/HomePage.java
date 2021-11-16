package Steps;

import Pages.CommonPages;
import Utils.Locators;
import Utils.TimeOut;
import net.thucydides.core.annotations.Step;

public class HomePage {

    CommonPages commonPages;

    @Step("This step will go to the webPage")
    public void goToEbay() {
    }

    @Step("This step will verify the title")
    public void verifyTitle() {
        commonPages.verifyTitle();
    }

    @Step("This will verify daily deals button")
    public void verifyDailyDealsButton() {
        commonPages.clickOnButtonByLinkText(Locators.dailyDeals);
        TimeOut.timeout();
        commonPages.verifyElementByLinkText(Locators.deals, Locators.dealsText);
    }

    @Step("This will verify help and contact button")
    public void verifyHelpAndContactButton() {
        commonPages.clickOnButtonByLinkText(Locators.helpAndContact);
        TimeOut.timeout();
        commonPages.verifyElementById(Locators.customerServiceId, Locators.customerServicesText);
    }

    @Step("This will verify sell button")
    public void verifySellButton() {
        commonPages.clickOnButtonByLinkText(Locators.sell);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.sellingPath, Locators.sellText);
    }

    @Step("This will verify Electronics button")
    public void verifyElectronicsButton() {
        commonPages.clickOnButtonByLinkText(Locators.electronics);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.electronicsPath, Locators.electronicsText);
    }

    @Step("This will verify Fashions button")
    public void verifyFashionButton() {
        commonPages.clickOnButtonByLinkText(Locators.fashion);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.fashionPath, Locators.fashionText);
    }

    @Step("This will verify Health And Beauty button")
    public void verifyHealthAndBeautyButton() {
        commonPages.clickOnButtonByLinkText(Locators.healthAndBeauty);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.healthAndBeautyPath, Locators.healthAndBeautyText);
    }

    @Step("This will verify Home And Garden button")
    public void verifyHomeAndGardenButton() {
        commonPages.clickOnButtonByLinkText(Locators.homeAndGarden);
        TimeOut.timeout();
        commonPages.verifyElementByLinkText(Locators.homeAndGardenPath, Locators.homeAndGardenText);
    }

    @Step("This will verify Sports button")
    public void verifySportsButton() {
        commonPages.clickOnButtonByLinkText(Locators.sports);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.sportsPath, Locators.sportsText);
    }

    @Step("This will verify Collectibles And Art Page button")
    public void verifyCollectiblesAndArtPageButton() {
        commonPages.clickOnButtonByLinkText(Locators.collectiblesAndArtPage);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.collectiblesAndArtPagePath, Locators.collectiblesAndArtPageText);
    }

    @Step("This will verify Industrial Equipment Page button")
    public void verifyIndustrialEquipmentPageButton() {
        commonPages.clickOnButtonByXPath(Locators.industrialEquipmentPage);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.industrialEquipmentPagePath, Locators.industrialEquipmentPageText);
    }

    @Step("This will verify Motors Page button")
    public void verifyMotorsPageButton() {
        commonPages.clickOnButtonByLinkText(Locators.motorsPage);
        TimeOut.timeout();
        commonPages.verifyElementUsingUrl(Locators.motorsPageUrl);
    }
}
