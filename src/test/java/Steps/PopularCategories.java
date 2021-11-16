package Steps;

import Pages.CommonPages;
import Utils.TimeOut;
import net.thucydides.core.annotations.Step;

public class PopularCategories {

    CommonPages commonPages;

    private String actor;

    @Override
    public String toString() {
        return actor;
    }

    @Step("This step verify that #actor is working")
    public void verifyElementWorking(String element, String url) {
        commonPages.clickOnButtonByXPath(element);
        TimeOut.timeout();
        commonPages.verifyElementUsingUrl(url);
    }
}
