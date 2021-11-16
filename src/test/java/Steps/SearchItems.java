package Steps;

import Pages.CommonPages;
import Utils.Locators;
import Utils.TimeOut;
import net.thucydides.core.annotations.Step;

public class SearchItems {

    CommonPages commonPages;

    @Step("User can search a item from search box")
    public void searchAItemByName() {
        commonPages.clickOnButtonByXPath(Locators.searchBox);
        TimeOut.timeout();
        commonPages.sendTextByXPath(Locators.searchBox, "Mobile");
        TimeOut.timeout();
        commonPages.clickOnButtonByXPath(Locators.searchBtn);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.searchPageTextPath, Locators.searchPageText);
    }

    @Step("User can select item from category")
    public void selectItemFromCategory() {
        commonPages.clickOnButtonById(Locators.categories);
        TimeOut.timeout();
        commonPages.clickOnButtonByXPath(Locators.categoryNameHealthAndBeauty);
        TimeOut.timeout();
        commonPages.clickOnButtonByXPath(Locators.searchBtn);
        TimeOut.timeout();
        commonPages.verifyElementByXPath(Locators.healthAndBeautyPath, Locators.healthAndBeautyText);
    }
}
