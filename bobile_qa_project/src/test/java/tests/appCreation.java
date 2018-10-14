package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;


public class appCreation extends TestBase {

    @BeforeMethod

    public void login() {
        app.login("autests@bobile.com", "123456");
    }

    @Test

    public void appCreation() throws AWTException {

//        app.getAppCreationHelper().clickOnPlusBtn();
//
//        app.getAppCreationHelper().chooseBusinessType();
//
//        app.getAppCreationHelper().clickOnNextBtnStep1();
//
//        app.getAppCreationHelper().fillAppName("Service app");
//
//        app.getAppCreationHelper().chooseAppCategory();
//
//        app.getAppCreationHelper().clickOnNextBtnStep2();
//        app.getAppCreationHelper().clickOnNoFacebookBtn();
        app.clickonManageBtn("Z@**@XFEMN0fH7zwuq1OtJS1v1D@**@GgFTKvfMKXuNNjYxUg=");
        app.getAppCreationHelper().clickOnContinueBtn();


        app.getAppCreationHelper().choosePlan();
        //app.getAppCreationHelper().chooseSubscription();
        app.getAppCreationHelper().clickStartTrial();
        app.getAppCreationHelper().confirmPurchase();
        app.getAppCreationHelper().clickOnGoToWorkspace();

    }

}
