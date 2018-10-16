package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class appCreation extends TestBase {

    @BeforeMethod

    public void login() {
        app.login("autests@bobile.com", "123456");
    }

    @Test

    public void appCreation() throws Exception {

        app.getAppCreationHelper().clickOnPlusBtn();

        app.getAppCreationHelper().chooseBusinessType();

        app.getAppCreationHelper().clickOnNextBtnStep1();

        app.getAppCreationHelper().fillAppName("Autotest");

        app.getAppCreationHelper().chooseAppCategory();

        app.getAppCreationHelper().clickOnNextBtnStep2();
        app.getAppCreationHelper().Wait(4000);
        app.getAppCreationHelper().clickOnNoFacebookBtn();

        //app.clickonManageBtn("fAD5yhSqgOwoFSLrfig1ygAg98AMtEa91710wAu998g=");
        app.getAppCreationHelper().clickOnContinueBtn();
        app.getAppCreationHelper().Wait(2000);
        app.getAppCreationHelper().choosePlan();
        app.getAppCreationHelper().Wait(2000);
        //app.getAppCreationHelper().chooseSubscription();
        app.getAppCreationHelper().Wait(6000);
        app.getAppCreationHelper().clickStartTrial();
        app.getAppCreationHelper().Wait(4000);
        app.getAppCreationHelper().confirmPurchase();
        app.getAppCreationHelper().clickOnGoToWorkspace();

    }

}
