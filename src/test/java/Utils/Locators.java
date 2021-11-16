package Utils;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Locators extends PageObject {
    public static String homePageUrl = "https://www.ebay.com/";
    public static String fbLoginPageTitle = "Log in to Facebook | Facebook";

    //homePageTests
    public static String deals = "Deals";
    public static String customerServiceId = "gh-title";
    public static String dealsText = "Deals";
    public static String customerServicesText = "Customer Service";
    public static String sellingPath = "/html/body/div[2]/div[1]/div/div[1]/h1";
    public static String sellText = "You are on selling home page\nSelling";
    public static String electronicsPath = "/html/body/div[5]/div[2]/h1/span";
    public static String electronicsText = "Electronics";
    public static String fashionPath= "/html/body/div[5]/div[2]/nav/ol/li[2]/span";
    public static String fashionText = "Fashion That’s Made for You";
    public static String healthAndBeautyPath = "/html/body/div[5]/div[2]/h1/span";
    public static String healthAndBeautyText = "Health & Beauty";
    public static String homeAndGardenPath = "Home & Garden";
    public static String homeAndGardenText = "Home & Garden";
    public static String sportsPath = "/html/body/div[5]/div[2]/section/div[1]/div[2]/h1";
    public static String sportsText = "Sporting Goods";
    public static String collectiblesAndArtPagePath = "/html/body/div[5]/div[2]/nav/ol/li[2]/span";
    public static String collectiblesAndArtPageText = "Collectibles";
    public static String industrialEquipmentPagePath = "/html/body/div[5]/div[2]/h1/span";
    public static String industrialEquipmentPageText = "Business & Industrial";
    public static String motorsPageUrl = "https://www.ebay.com/sch/6028/i.html?_from=R40&_nkw=Auto+Parts+Accessories&_blrs=recall_filtering";

    public static String dailyDeals = "Daily Deals";
    public static String helpAndContact = "Help & Contact";
    public static String sell = "Sell";
    public static String electronics = "Electronics";
    public static String fashion = "Fashion";
    public static String healthAndBeauty = "Health & Beauty";
    public static String homeAndGarden = "Home & Garden";
    public static String sports = "Sports";
    public static String collectiblesAndArtPage = "Collectibles and Art";
    public static String industrialEquipmentPage = "//*[@id='mainContent']/div[1]/ul/li[9]/a";
    public static String motorsPage = "Motors";

    //popular categories
    public static String sneakers = "//*[@id='destinations_list1']/ul/li[1]";
    public static String koreanBeauty = "//*[@id='destinations_list1']/ul/li[2]";
    public static String wristWatches = "//*[@id='destinations_list1']/ul/li[3]";
    public static String fishing = "//*[@id='destinations_list1']/ul/li[4]";
    public static String collectibles = "//*[@id='destinations_list1']/ul/li[5]";
    public static String smartPhones = "//*[@id='destinations_list1']/ul/li[6]";
    public static String popularSell = "//*[@id='destinations_list1']/ul/li[7]";

    public static String sneakersUrl = "https://www.ebay.com/b/Retail-Campaign/bn_7116433159";
    public static String koreanBeautyUrl = "https://www.ebay.com/b/Korean-Health-and-Beauty/bn_7116437158";
    public static String wristWatchesUrl = "https://www.ebay.com/b/Wristwatches/31387/bn_2408451";
    public static String fishingUrl = "https://www.ebay.com/b/Fishing-Equipment-Supplies/1492/bn_1851047";
    public static String collectiblesUrl = "https://www.ebay.com/b/Collectibles-Art/bn_7000259855";
    public static String smartPhonesUrl = "https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441";
    public static String popularSellUrl = "https://export.ebay.com/ru/";

    //Registration
   /*public static By registration = By.linkText("Registration");
    public static By firstSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div/div/div/div/p[2]/a");
    public static By secondSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div[2]/div/div/div/a");
    public static By signUpPage = By.xpath("//*[@id='mainContent']/div[3]/h1");
    public static String signUpPageText = "Create an account";

    //Buy
    public static By moneyBackGuarantee = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[3]/a");
    public static By biddingAndBuyingHelp = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[4]/a");
    public static By stores = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[5]/a");
    public static String moneyBackGuaranteeUrl = "https://pages.ebay.com/ebay-money-back-guarantee/";
    public static String biddingAndBuyingHelpUrl = "https://www.ebay.com/help/buying";
    public static String storesUrl = "https://www.ebay.com/b/Stores-HUB/bn_7004224522";*/

    //Sign In
    public static String signIn = "Sign in";
    //public static By fbId = $(By.id("signin_fb_btn"));
    WebElementFacade fbXPath = $(By.xpath("//*[@id='signin_fb_btn']"));
    WebElementFacade googleId = $(By.id("signin_ggl_btn"));
    WebElementFacade userName = $(By.id("userid"));
    WebElementFacade continueBtn = $(By.id("signin-continue-btn"));
    WebElementFacade passWord = $(By.id("pass"));
    WebElementFacade signInBtn = $(By.id("sgnBt"));
    WebElementFacade profileBtn = $(By.id("gh-ug"));
    WebElementFacade signOut = $(By.linkText("Sign out"));

    //Sell
    public static String startSellingPageUrl = "https://www.ebay.com/sl/sell";
    public static String learnToSellPageUrl = "https://pages.ebay.com/seller-center/get-started/selling-basics.html";
    public static String affiliatesPageUrl = "https://partnernetwork.ebay.com/";

   /* public static By startSelling = By.linkText("Start selling");
    public static By learnToSell = By.linkText("Learn to sell");
    public static By affiliates = By.linkText("Affiliates");*/

    //Search Product

    public static String searchBox = "//*[@id='gh-ac']";
    public static String searchBtn = "//*[@id='gh-btn']";
    public static String searchPageTextPath = "//*[@id='mainContent']/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]";
    public static String searchPageText = "mobile";
    public static String categories = "gh-cat";
    public static String categoryNameHealthAndBeauty = "//*[@id='gh-cat']/option[20]";
}
