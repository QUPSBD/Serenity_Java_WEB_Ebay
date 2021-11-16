package Steps;

import Pages.CommonPages;
import Utils.Locators;
import Utils.TimeOut;
import net.thucydides.core.annotations.Step;

public class SignIn {

    CommonPages commonPages;

    @Step("user can login using username and password")
    public void signInUsingUserNameAndPassword() {
        commonPages.clickOnButtonByLinkText(Locators.signIn);
        TimeOut.timeout();
        commonPages.getBack();
    }
}
