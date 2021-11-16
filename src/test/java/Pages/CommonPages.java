package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class CommonPages extends PageObject {

    public void goToWebPage (){
    }

    public void verifyTitle(){
        assertEquals(getDriver().getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
    }

    public void clickOnButtonByLinkText(String btn){
        find(By.linkText(btn)).click();
    }

    public void verifyElementByLinkText(String element, String text) {
        String elementText = find(By.linkText(element)).getText();
        assertEquals(elementText, text);
        System.out.println("Successfully visit " + elementText);
    }

    public void getBack() {
        getDriver().navigate().back();
    }

    public void verifyElementById(String element, String text) {
        String elementText = find(By.id(element)).getText();
        assertEquals(elementText, text);
        System.out.println("Successfully visit " + elementText);
    }

    public void verifyElementByXPath(String element, String text) {
        String elementText = find(By.xpath(element)).getText();
        assertEquals(elementText, text);
        System.out.println("Successfully visit " + elementText);
    }

    public void clickOnButtonByXPath(String btn) {
        find(By.xpath(btn)).click();
    }

    public void verifyElementUsingUrl(String url) {
        assertEquals(getDriver().getCurrentUrl(), url);
        System.out.println("Successfully visit " + url);
    }

    public void sendTextByXPath(String fieldName, String text) {
        find(By.xpath(fieldName)).sendKeys(text);
    }

    public void clickOnButtonById(String btn) {
        find(By.id(btn)).click();
    }
}
